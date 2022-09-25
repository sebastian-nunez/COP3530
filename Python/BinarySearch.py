def main():
    items = [2, 3, 5, 8, 12, 43, 55, 92, 120, 342, 499]
    items2 = [2, 3, 4, 4, 4, 4, 5, 9, 12]

    assert binary_search(items, 120) == True
    assert binary_search(items, 4) == False

    assert find_lower(items2, 4) == 2
    assert find_lower(items2, 12) == 8
    assert find_lower(items2, 3) == 1
    assert find_lower(items2, 2) == 0

    assert find_upper(items2, 4) == 5
    assert find_upper(items2, 12) == 8
    assert find_upper(items2, 3) == 1
    assert find_upper(items2, 2) == 0


def binary_search(array: list, target: int) -> bool:
    lower = 0
    upper = len(array) - 1

    while lower <= upper:
        mid = lower + (upper - lower) // 2

        if array[mid] == target:
            return True
        elif target > array[mid]:
            lower = mid + 1
        else:
            upper = mid - 1

    return False


def find_lower(array: list, target: int) -> int:
    lower = 0
    upper = len(array) - 1

    if array[lower] == target:
        return lower

    while lower <= upper:
        mid = lower + (upper - lower) // 2

        if array[mid] == target and array[mid - 1] < target:
            return mid
        elif target > array[mid]:
            lower = mid + 1
        else:
            upper = mid - 1

    return -1


def find_upper(array: list, target: int) -> int:
    lower = 0
    upper = len(array) - 1

    if array[upper] == target:
        return upper

    while lower <= upper:
        mid = lower + (upper - lower) // 2

        if array[mid] == target and array[mid + 1] > target:
            return mid
        elif target >= array[mid]:
            lower = mid + 1
        else:
            upper = mid - 1

    return -1


if __name__ == '__main__':
    main()
