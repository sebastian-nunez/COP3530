def main():
    deque = Deque()

    print(f'is_empty(): {deque.is_empty()}')
    print(deque)

    deque.append(4)
    deque.append(5)
    deque.appendleft(3)
    deque.appendleft(2)
    print(deque)

    print(f'Pop: {deque.pop()}')
    print(f'Pop: {deque.pop()}')
    print(f'Popleft: {deque.popleft()}')
    print(deque)

    print(f'Popleft: {deque.popleft()}')
    print(deque)
    print(f'Pop: {deque.pop()}')


class Node:
    def __init__(self, data: int = None):
        self.data = data
        self.next = None
        self.prev = None


class Deque:
    def __init__(self):
        self.head = Node()
        self.tail = Node()

        self.head.next = self.tail
        self.tail.prev = self.head

        self.size = 0

    def append(self, data: int) -> None:
        new_node = Node(data)
        prev = self.tail.prev

        new_node.prev = prev
        prev.next = new_node

        new_node.next = self.tail
        self.tail.prev = new_node

        self.size += 1

    def appendleft(self, data: int) -> None:
        new_node = Node(data)
        next = self.head.next

        new_node.next = next
        next.prev = new_node

        self.head.next = new_node
        new_node.prev = self.head

        self.size += 1

    def pop(self) -> int:
        if self.is_empty():
            print('deque is empty!')
            return None

        removed = self.tail.prev
        last = removed.prev

        last.next = self.tail
        self.tail.prev = last

        self.size -= 1
        return removed.data

    def popleft(self) -> int:
        if self.is_empty():
            print('deque is empty!')
            return None

        removed = self.head.next
        first = removed.next

        self.head.next = first
        first.prev = self.head

        self.size -= 1
        return removed.data

    def is_empty(self) -> None:
        return self.size == 0

    def __str__(self) -> str:
        if self.is_empty():
            return 'Deque: []'

        output = ''

        current = self.head.next
        for _ in range(self.size - 1):
            output += f'{current.data}, '
            current = current.next

        return f'Deque: [{output}{self.tail.prev.data}]'


if __name__ == '__main__':
    main()
