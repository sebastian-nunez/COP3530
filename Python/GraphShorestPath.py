from collections import deque


def main():
    edges = [['w', 'x'], ['x', 'y'], ['z', 'y'], ['z', 'v'], ['w', 'v']]

    print(shorest_path_bfs(edges, 'w', 'z'))  # -> 2


def shorest_path_bfs(edges: list, src: str, dst: str) -> int:
    graph = graph_from_edges(edges)

    queue = deque([(src, 0)])  # (node, distance from the src)
    visited = set([(src, 0)])

    while queue:
        (current, distance) = queue.popleft()

        if current == dst:
            return distance

        # explore the neighbors
        for neighbor in graph[current]:
            if neighbor in visited:  # skip visited neighbors
                continue

            queue.append((neighbor, distance + 1))
            visited.add(current)

    return -1


def graph_from_edges(edges: list) -> dict:
    graph = dict()

    for (src, dst) in edges:
        if src not in graph:
            graph[src] = set()

        if dst not in graph:
            graph[dst] = set()

        graph[src].add(dst)
        graph[dst].add(src)

    return graph


if __name__ == '__main__':
    main()
