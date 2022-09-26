optimized_count = 0
naive_count = 0


def main():
    global naive_count
    global optimized_count

    dictionary = Trie()
    file = open("./words.txt", "r")

    words_list = []
    for word in file:
        word = word.strip().lower()

        dictionary.insert(word)
        words_list.append(word)

    while True:
        naive_count = 0
        optimized_count = 0

        word = input('Enter a word (type "!q" to quit):: ').strip().lower()

        if word == '!q':
            file.close()
            exit()

        if not word.isalpha():
            print('Only letters [a-z] are allowed! Try again...')
            continue

        is_valid_word = dictionary.search(word)
        for w in words_list:
            naive_count += 1
            if w == word:
                break

        if is_valid_word:
            print(f'{word} is a valid word!')
        else:
            print(f'{word } is NOT a valid word!')

        print(f'Number of comparisons for "naive" solution: {naive_count}')
        print(
            f'Number of comparisons for "optimized" solution: {optimized_count}')


class Node:
    def __init__(self, data: str = '*'):
        self.data = data
        self.children = dict()


class Trie:
    def __init__(self):
        self.root = Node('*')

    def insert(self, word: str) -> bool:
        if word == '':
            return False

        current = self.root
        for char in word:
            if char not in current.children:
                current.children[char] = Node(char)

            current = current.children[char]

        current.children['*'] = Node('*')

        return True

    def search(self, word: str) -> bool:
        global optimized_count

        if word == '':
            return False

        current = self.root
        for char in word:
            optimized_count += 1

            if char not in current.children:
                return False

            current = current.children[char]

        return '*' in current.children

    def prefix(self, prefix: str) -> bool:
        if prefix == '':
            return False

        current = self.root
        for char in prefix:
            if char not in current.children:
                return False

            current = current.children[char]

        return True

    def print_preorder(self, node: Node) -> None:
        if node.data == '*':
            print()
        else:
            print(node.data, end=' ')

        for child in node.children.values():
            self.print_preorder(child)


if __name__ == '__main__':
    main()
