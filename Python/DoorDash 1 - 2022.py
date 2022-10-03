#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'findKthNextGreaterElement' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER_ARRAY prices
#  2. INTEGER k
#

def findKthNextGreaterElement(prices, k):
    output = []
    n = len(prices)

    for i, num in enumerate(prices):
        i += 1
        temp = []                      # stores elements greater than the current num
        # temp should store at most 'k' number of elements
        while i < n and len(temp) <= k:
            if prices[i] > num:
                temp.append((prices[i], i + 1))
            i += 1

        if k <= len(temp):              # make sure k is in bounds
            (val, index) = temp[k - 1]  # get the kth greater element
            # append the index of that element in the prices array
            output.append(index)
        else:
            output.append(-1)

    return output


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    prices_count = int(input().strip())

    prices = []

    for _ in range(prices_count):
        prices_item = int(input().strip())
        prices.append(prices_item)

    k = int(input().strip())

    result = findKthNextGreaterElement(prices, k)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
