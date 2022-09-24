from collections import deque


def main():
    graph = {
        'a': set(['c', 'b']),
        'b': set(['d']),
        'c': set(['e']),
        'd': set(['f']),
        'e': set(),
        'f': set()
    }

    print_dfs(graph, 'a')
    print('-------------')
    print_bfs(graph, 'a')
    print('-------------')
    print(f"a to e(dfs): {path_dfs(graph, 'a', 'e')}")
    print(f"a to z(dfs): {path_dfs(graph, 'a', 'z')}")
    print(f"b to f (dfs recursive): {path_dfs_recursive(graph, 'b', 'f')}")
    print(f"d to b (dfs recursive): {path_dfs_recursive(graph, 'd', 'b')}")
    print(f"b to e (dfs recursive): {path_dfs_recursive(graph, 'b', 'e')}")
    print('-------------')
    print(f"a to e(bfs): {path_bfs(graph, 'a', 'e')}")
    print(f"a to z(bfs): {path_bfs(graph, 'a', 'z')}")
    print(f"b to f (bfs recursive): {path_bfs_recursive(graph, 'b', 'f')}")
    print(f"d to b (bfs recursive): {path_bfs_recursive(graph, 'd', 'b')}")
    print(f"b to e (bfs recursive): {path_bfs_recursive(graph, 'b', 'e')}")


def path_dfs(graph, source, target) -> bool:
    # check if the graph is empty
    if graph is None:
        return False

    # create a stack to track the order to visit the nodes
    stack = [source]

    # iterate through the stack (while its not empty)
    while stack:
        # pop the top element
        current = stack.pop()

        # compare the top to the target
        if current == target:
            return True

        # iterate through the neighbors of the current node
        for neighbor in graph[current]:
            # add the neighbor to the stack
            stack.append(neighbor)

    return False


def path_dfs_recursive(graph, source, target) -> bool:
    # check if graph is empty
    if graph is None:
        return False

    # check if the source == target -> return True
    if source == target:
        return True

    # check all the neighbors recursively
    for neighbor in graph[source]:
        if path_dfs_recursive(graph, neighbor, target):
            return True

    return False


def path_bfs(graph, source, target) -> bool:
    # check if graph is empty
    if graph is None:
        return False

    # create a queue to preserve the order of the visited nodes
    queue = deque([source])

    # iterate through the queue
    while queue:
        # pop the front (dequeue)
        current = queue.popleft()

        # compare current to the target
        if current == target:
            return True

        # iterate through all the neighbors of the current node
        for neighbor in graph[current]:
            # add all the neighbors to the stack
            queue.append(neighbor)

    return False


def path_bfs_recursive(graph, source, target) -> bool:
    # check for empty graph
    if graph is None:
        return False

    # compare source to target
    if source == target:
        return True

    # iterate through the neighbors
    for neighbor in graph[source]:
        # check if any of the neighbors have a path to the target
        if path_bfs_recursive(graph, neighbor, target):
            return True

    return False


def print_dfs(graph, source) -> None:
    # check for empty graph
    if graph is None:
        return

    # create a stack to keep track of the nodes
    stack = [source]

    # iterate through the stack while its not empty
    while stack:
        # pop the last element
        current = stack.pop()

        # do something...
        print(current)

        # iterate through all neighbors (of this node) and add them to the stack
        for neighbor in graph[current]:
            stack.append(neighbor)


def print_bfs(graph, source) -> None:
    # check if the graph is empty
    if graph is None:
        return

    # set up a queue to keep the order to visit the nodes
    queue = deque([source])

    # iterate through the queue while its no empty
    while queue:
        # remove the front of the queue
        current = queue.popleft()

        # print the current element
        print(current)

        # iterate through all the neighbor of this node and push them to the queue
        for neighbor in graph[current]:
            queue.append(neighbor)


if __name__ == '__main__':
    main()
