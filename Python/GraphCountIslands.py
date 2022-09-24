def main():
    graph = {
        0: [8, 1, 5],
        1: [0],
        5: [0, 8],
        8: [0, 5],
        2: [3, 4],
        3: [2, 4],
        4: [3, 2]
    }  # -> 2

    print(countIslands(graph))


def countIslands(graph: dict) -> int:
    visited = set()

    count = 0
    for node in graph:
        if explore_node(graph, node, visited):
            count += 1

    return count


def explore_node(graph: dict, source: int, visited: set) -> bool:
    if source in visited:
        return False

    visited.add(source)

    for neighbor in graph[source]:
        explore_node(graph, neighbor, visited)

    return True  # sucessfully explored all neighbors


if __name__ == '__main__':
    main()
