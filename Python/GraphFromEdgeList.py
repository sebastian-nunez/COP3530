def main():
    edges = [['i', 'j'], ['k', 'i'], ['m', 'k'], ['k', 'l'], ['o', 'n']]

    graph = graph_from_edges(edges)

    print(f"j to m: {has_path_dfs(graph, 'j', 'm')}")


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


def has_path_dfs(graph, src, dst) -> bool:
    if graph == None:
        return False

    stack = [src]
    visited = set()

    while stack:
        current = stack.pop()
        visited.add(current)

        if current == dst:
            return True

        for neighbor in graph[current]:
            if neighbor not in visited:
                stack.append(neighbor)

    return False


if __name__ == '__main__':
    main()
