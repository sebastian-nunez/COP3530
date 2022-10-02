def largestMagicNumber(arr):
    if len(arr) == 1:
        sorted_arr = sorted(arr[0])
        arr = arr[0]

        if sorted_arr == arr:
            return arr[-1]
        else:
            return -1

    magic_nums = find_magic_nums(arr)

    return max(magic_nums)


def find_magic_nums(arr):
    rows = len(arr)
    cols = len(arr[0])

    magic_nums = set([-1])
    for i in range(rows):
        for j in range(cols):
            current = arr[i][j]

            k = 0
            row = []
            while k < cols:
                if k == j:  # skip current
                    k += 1
                    continue

                row.append(arr[i][k])  # horizontal neighbors
                k += 1

            sorted_row = sorted(row)
            if row != sorted_row:
                continue

            k = 0
            col = []
            while k < rows:
                if k == i:  # skip current
                    k += 1
                    continue

                col.append(arr[k][j])  # vertical neighbors
                k += 1

            sorted_col = sorted(col)
            if col != sorted_col:
                continue

            magic_nums.add(current)

    return magic_nums


if __name__ == '__main__':
    matrix1 = [[1, 11, 4], [6, 2, 7], [5, 9, 3], [14, 13, 12]]
    matrix2 = [[1, 2, 3]]

    '''
    A number is a "magic number", if:
    1. horizontal neighbors (not including the current) are in asceding order
    2. vertical neighbors (not including the current) are in asceding order
    3. return the highest magic number

    01 11 04     -> 11 is a magic number
    06 02 07     -> 6 is a magic number
    05 09 03     -> 3 is a magic number
    14 13 12

    '''
    print(largestMagicNumber(matrix1))
    print(largestMagicNumber(matrix2))
