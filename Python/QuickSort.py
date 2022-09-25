def main():
    array = [3, 8, 12, 2, 9, 23, 1, 48]
    print(quicksort(array))


def quicksort(array: list) -> list:
    if len(array) <= 1:
        return array

    pivot = array.pop()

    items_less = []
    items_greater = []
    for num in array:
        if (num > pivot):
            items_greater.append(num)
        else:
            items_less.append(num)

    return quicksort(items_less) + [pivot] + quicksort(items_greater)


if __name__ == '__main__':
    main()
