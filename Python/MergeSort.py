def main():
    array = [3, 8, 12, 2, 9, 23, 1, 48]
    mergesort(array)
    print(array)


def mergesort(array: list) -> list:
    if len(array) <= 1:
        return

    mid = len(array) // 2
    left_half = array[:mid]
    right_half = array[mid:]

    mergesort(left_half)
    mergesort(right_half)

    merge(array, left_half, right_half)


def merge(array: list, left: list, right: list):
    i, j, k = 0, 0, 0
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            array[k] = left[i]
            i += 1
        else:
            array[k] = right[j]
            j += 1

        k += 1

    while i < len(left):
        array[k] = left[i]
        i += 1
        k += 1

    while j < len(right):
        array[k] = right[j]
        j += 1
        k += 1


if __name__ == '__main__':
    main()
