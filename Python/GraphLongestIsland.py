def main():
    graph = {
        0: [8, 1, 5],
        1: [0],
        5: [0, 8],
        8: [0, 5],
        2: [3, 4],
        3: [2, 4],
        4: [3, 2]
    }  # -> 4

    print(longestIsland(graph))


def longestIsland(graph: dict) -> bool:
    visited = set()

    longest = 0
    for node in graph:
        # size = find_size(graph, node, visited)
        size = find_size_recursive(graph, node, visited)

        if size > longest:
            longest = size

    return longest


def find_size_recursive(graph: dict, node: int, visited: set) -> int:
    if node in visited:
        return 0

    visited.add(node)

    size = 1  # size of the current node
    for neighbor in graph[node]:
        size += find_size_recursive(graph, neighbor, visited)

    return size


def find_size(graph: dict, node: int, visited: set) -> int:
    if node in visited:
        return 0

    stack = [node]
    visited.add(node)

    size = 1
    while stack:
        current = stack.pop()

        for neighbor in graph[current]:
            if neighbor in visited:
                continue

            stack.append(neighbor)
            visited.add(neighbor)
            size += 1

    return size


if __name__ == '__main__':
    main()
