from ast import List


def main():
    array = [1, 2, 3, 4, 5, 6]
    k = 3

    print(sum_subarray(array, k))


def sum_subarray(array: list, k: int) -> list:
    current_sum = sum(array[:k])
    result = [current_sum]

    for i in range(1, len(array) - k + 1):
        current_sum -= array[i - 1]
        current_sum += array[i + (k - 1)]
        result.append(current_sum)

    return result


if __name__ == '__main__':
    main()
