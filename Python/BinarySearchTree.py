from typing import overload


def main():
    tree = BinarySearchTree()
    tree.insert(15)
    tree.insert(16)
    tree.insert(3)
    tree.insert(45)
    tree.insert(25)
    tree.insert(18)
    tree.insert(20)
    tree.insert(50)

    tree.print_inorder(tree.root)
    print("-------------------------")

    print(f'is 18 in the tree: {tree.search(18, tree.root)}')
    print(f'is 50 in the tree: {tree.search(50, tree.root)}')
    print(f'is 99 in the tree: {tree.search(99, tree.root)}')


class Node:
    def __init__(self, data: int):
        self.data = data
        self.left = None
        self.right = None


class BinarySearchTree:
    def __init__(self, root: Node = None):
        self.root = root

    def insert(self, data: int) -> None:
        if self.root is None:  # empty tree -> create root
            self.root = Node(data)
        else:  # insert at the root
            self.insert_node(data, self.root)

    def insert_node(self, data: int, node: Node) -> None:
        if data < node.data:
            if node.left is None:
                node.left = Node(data)
            else:
                self.insert_node(data, node.left)
        else:
            if node.right is None:
                node.right = Node(data)
            else:
                self.insert_node(data, node.right)

    def search(self, target, node: Node) -> bool:
        if node is None:  # bottomed out, the value was not found
            return False

        if node.data == target:
            return True

        if target < node.data:
            return self.search(target, node.left)
        else:
            return self.search(target, node.right)

    def print_inorder(self, node: Node) -> None:
        if node is None:
            return

        self.print_inorder(node.left)
        print(node.data)
        self.print_inorder(node.right)


if __name__ == '__main__':
    main()
