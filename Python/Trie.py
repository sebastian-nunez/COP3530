def main():
    trie = Trie()
    trie.insert('hello')
    trie.insert('hi')
    trie.insert('low')
    trie.insert('loco')

    trie.print_preorder(trie.root)

    print(f'"hello": {trie.search("hello")}')
    print(f'"low": {trie.search("low")}')
    print(f'"loco": {trie.search("loco")}')

    print(f'"locomotive": {trie.search("locomotive")}')
    print(f'prefix "hell": {trie.prefix("hell")}')
    print(f'prefix "helo": {trie.prefix("helo")}')


class Node:
    def __init__(self, data: str):
        self.data = data
        self.children = dict()


class Trie:
    def __init__(self):
        self.root = Node('\0')

    def insert(self, word: str) -> bool:
        if word == '':
            return False

        current = self.root
        for char in word:
            if char not in current.children:
                current.children[char] = Node(char)

            current = current.children[char]

        current.children['\0'] = None

        return True

    def search(self, word: str) -> bool:
        current = self.root

        for char in word:
            if char not in current.children:
                return False

            current = current.children[char]

        return current.children['\0'] == None

    def prefix(self, prefix: str) -> bool:
        current = self.root

        for char in prefix:
            if char not in current.children:
                return False

            current = current.children[char]

        return True

    def print_preorder(self, node: Node) -> None:
        if node is None:
            print()
            return

        print(node.data, end=' ')

        for child in node.children.values():
            self.print_preorder(child)


if __name__ == '__main__':
    main()
