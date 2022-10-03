import math


def findMinimumLengthSubarray(arr, k):
    min_length = +math.inf

    nums = []
    unique = set()
    upper = 0
    lower = 0
    while upper < len(arr):
        current = arr[upper]

        nums.append(current)
        unique.add(current)

        current_length = len(unique)
        if current_length == k:
            if current_length < min_length:
                min_length = current_length
            lower += 1
            nums = nums[1:]
            unique = set(nums)

        upper += 1

    if min_length == +math.inf:
        return -1

    return min_length


if __name__ == '__main__':
    arr = [2, 2, 1, 1, 3]
    print(findMinimumLengthSubarray(arr, 2))
    arr = [3, 2, 3, 3, 1, 3]
    print(findMinimumLengthSubarray(arr, 3))
    arr = [1, 2, 2, 1, 2]
    print(findMinimumLengthSubarray(arr, 3))
