from collections import deque


def main():
    edges = [['w', 'x'], ['x', 'y'], ['z', 'y'], ['z', 'v'], ['w', 'v']]

    print(shorest_path_bfs(edges, 'w', 'z'))  # -> 2


def shorest_path_bfs(edges: list, source: str, target: str) -> int:
    graph = graph_from_edges(edges)
    queue = deque([(source, 0)])  # pair: (node, distance from the src)
    visited = set([source])

    while queue:
        (current, distance) = queue.popleft()

        if current == target:
            return distance

        # explore the neighbors
        for neighbor in graph[current]:
            if neighbor in visited:  # skip visited neighbors
                continue

            queue.append((neighbor, distance + 1))
            visited.add(neighbor)

    return -1


def graph_from_edges(edges: list) -> dict:
    graph = dict()

    for (source, target) in edges:
        if source not in graph:
            graph[source] = set()

        if target not in graph:
            graph[target] = set()

        graph[source].add(target)
        graph[target].add(source)

    return graph


if __name__ == '__main__':
    main()
