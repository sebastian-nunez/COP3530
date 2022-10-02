def largestMagicNumber(arr):
    # Write your code here
    magic_nums = set([-1])

    # Approach: run a DFS algorithm (the 'arr' is an adjecency matrix)
    # 1. Explore RIGHT neighbors:
    #    -> if a right neighbor is less than the current node (current > right),
    #      that starting point is NOT a magic number
    # 2. Explore BOTTOM neighbors:
    #    -> if a bottom neighbor is less than the current node (current > bottom)
    #      that starting point is NOT a magic number
    # 3. Add magic numbers to a set
    # 4. Return the greatest magic number (by default its -1)

    # ----------------- MISCALCULATION --------------------
    # I forgot that we also care about the neighbors before the current cell NOT just the cells after.
    #
    # ----------------- END --------------------

    # turn the matrix into an adjencency list (current: [RIGHT, BOTTOM])
    if (len(arr) == 1):
        sorted_arr = sorted(arr[0])
        arr = arr[0]
        if sorted_arr == arr:
            return arr[-1]
        else:
            return -1

    graph = graph_from_matrix(arr)

    for node, neighbors in graph.items():
        horizontal = neighbors[0]
        vertical = neighbors[1]

        if horizontal and explore_dfs(horizontal):
            if vertical and explore_dfs(vertical):
                magic_nums.add(node)

    return max(magic_nums)


def graph_from_matrix(arr, ):
    graph = dict()
    rows = len(arr)
    cols = len(arr[0])

    for i in range(rows):
        for j in range(cols):
            current = arr[i][j]
            if current not in graph:
                graph[current] = [list(), list()]

            k = 0
            while k < cols:
                if k == j:  # skip current
                    k += 1
                    continue

                graph[current][0].append(arr[i][k])  # horizontal neighbors
                k += 1

            k = 0
            while k < rows:
                if k == i:  # skip current
                    k += 1
                    continue

                graph[current][1].append(arr[k][j])  # vertical neighbors
                k += 1

    return graph


def explore_dfs(source):
    sorted_source = sorted(source)

    if sorted_source != source:
        return False

    return True


if __name__ == '__main__':
    matrix1 = [[1, 2, 3]]
    matrix2 = [[1, 11, 4], [6, 2, 7], [5, 9, 3], [14, 13, 12]]
    print(largestMagicNumber(matrix1))
    print(largestMagicNumber(matrix2))
