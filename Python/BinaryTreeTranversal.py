from collections import deque


def main():
    a = Node('a')
    b = Node('b')
    c = Node('c')
    d = Node('d')
    e = Node('e')
    f = Node('f')

    a.left = b
    a.right = c
    b.left = d
    b.right = e
    c.right = f

    #      a
    #    /   \
    #   b     c
    #  /  \    \
    # d    e    f

    print("Pre Order")
    print_preorder(a)
    print("--------------------------")
    print("Pre In-Order")
    print_inorder(a)
    print("--------------------------")
    print("Post Order")
    print_postorder(a)
    print("--------------------------")

    print(f"bfs found 'e': {tree_bfs(a, 'e')}")
    print(f"bfs found 'g': {tree_bfs(a, 'g')}")
    print(f"bfs found 'b': {tree_bfs(a, 'b')}")

    print("--------------------------")

    print(f"dfs found 'e': {tree_dfs(a, 'e')}")
    print(f"dfs found 'g': {tree_dfs(a, 'g')}")
    print(f"dfs found 'b': {tree_dfs(a, 'b')}")


class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


# tree tranversal using depth-first search (dfs)
def tree_dfs(node: Node, target: str) -> bool:
    # check for empty tree
    if node == None:
        return False

    # set up a stack to store the visited nodes
    stack = [node]

    # iterate through the stack while its not empty
    while stack:
        # pop the top of the stack
        current = stack.pop()

        # compare the value at the top with the target
        if current.data == target:
            return True

        # push the children (if they exist)
        if current.right:
            stack.append(current.right)

        if current.left:
            stack.append(current.left)

    return False


# tree tranversal using breath-first search (bfs)
def tree_bfs(node: Node, target: str) -> bool:
    # empty tree
    if node == None:
        return False

    # create a queue
    queue = deque([node])

    # iterate through the queue (while its not empty)
    while queue:
        # dequeue the front node and checks its value compared to the target
        current = queue.popleft()

        if current.data == target:
            return True

        # enqueue the children nodes (if they exist)
        if current.left:
            queue.append(current.left)

        if current.right:
            queue.append(current.right)

    return False


def print_preorder(node: Node = None) -> None:
    if node is None:
        return

    print(node.data)
    print_preorder(node.left)
    print_preorder(node.right)


def print_inorder(node: Node = None) -> None:
    if node is None:
        return

    print_inorder(node.left)
    print(node.data)
    print_inorder(node.right)


def print_postorder(node: Node = None) -> None:
    if node is None:
        return

    print_postorder(node.left)
    print_postorder(node.right)
    print(node.data)


if __name__ == "__main__":
    main()
