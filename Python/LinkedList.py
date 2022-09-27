def main():
    linked_list = LinkedList()
    linked_list.add(1)
    linked_list.add(2)
    linked_list.add(3)
    linked_list.add(3)
    linked_list.add(4)
    linked_list.add(5)
    linked_list.add(6)
    linked_list.add(7)
    linked_list.add(8)

    linked_list.remove(3)
    linked_list.remove(4)
    linked_list.remove(8)
    linked_list.remove(7)
    linked_list.remove(1)

    linked_list.insert(99, 1)

    print(linked_list)

    linked_list.reverse()
    print(linked_list)

    linked_list.add(66)
    linked_list.insert(77, 3)
    print(linked_list)

    print(f"Found 99? {linked_list.search(99)}")
    print(f"Found 7? {linked_list.search(7)}")

    print(f'List size: {linked_list.size}')

    linked_list.clear()
    print(f"Is the list empty? {linked_list.is_empty()}")
    print(linked_list)


class Node:
    def __init__(self, data: int = None, next=None):
        self.data = data
        self.next = next


class LinkedList:
    def __init__(self):
        self.head = Node()
        self.size = 0

    def add(self, data: int) -> None:
        next = self.head.next
        self.head.next = Node(data, next)
        self.size += 1

    def insert(self, data: int, index: int) -> bool:
        if index > self.size:
            return False

        current = self.head.next
        prev = self.head

        i = 0
        while current:
            if i == index:
                next = prev.next
                prev.next = Node(data, next)
                self.size += 1
                return True

            i += 1
            prev = current
            current = current.next

        return False

    def remove(self, target: int) -> bool:
        if self.is_empty():
            return False

        current = self.head.next
        prev = self.head

        while current:
            if current.data == target:
                prev.next = current.next
                self.size -= 1
                return True

            prev = current
            current = current.next

        return False

    def search(self, target: int) -> bool:
        current = self.head.next

        while current:
            if current.data == target:
                return True

            current = current.next

        return False

    def reverse(self) -> None:
        current = self.head.next
        prev = None

        while current:
            next = current.next
            current.next = prev
            prev = current
            current = next

        self.head = prev
        self.add(prev.data)
        self.head.data = None

    def is_empty(self) -> bool:
        return self.size == 0

    def clear(self) -> None:
        self.head = Node()
        self.size = 0

    def __str__(self) -> str:
        if self.is_empty():
            return '[]'

        output = '['

        current = self.head
        while current:
            if current.data:
                output += f'{current.data} -> '
            current = current.next

        return output + ']'


if __name__ == '__main__':
    main()
