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
        current = explore_size_dfs(graph, node, visited)

        if current > longest:
            longest = current

    return longest


def explore_size_dfs(graph: dict, node: int, visited: set) -> int:
    if node in visited:
        return 0

    visited.add(node)

    size = 1  # size of the current node
    for neighbor in graph[node]:
        size += explore_size_dfs(graph, neighbor, visited)

    return size


if __name__ == '__main__':
    main()
