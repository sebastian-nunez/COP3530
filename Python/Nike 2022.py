import sys
# import numpy as np
# import pandas as pd
# from sklearn import ...
#
# ---------------------- INITIAL "NAIVE" APPROACH --------------------------
# MAX_DEPTH = 1000 # maximum number of digit_sums to be computed before giving up
#
# # Returns 1 is a number is a happy number, otherwise 0
# def is_happy_num_naive(num):
#     for _ in range(MAX_DEPTH):
#         squared_digit_sum = sum_digits_squared(num)
#
#         if squared_digit_sum == 1:
#             return 1
#
#         num = squared_digit_sum
#
#     return 0
# ---------------------------------------------------------------------------


# Returns the "squared digit sum" of a number (recursively)
def sum_digits_squared(num):
    if num == 0:
        return 0

    digit = num % 10
    num //= 10

    return (digit * digit) + sum_digits_squared(num)


# -------------------------- BETTER APPROACH --------------------------------
# - Key Realization: if we have previously computed the 'digit_sum' of the current 'num',
#                    then the current 'num' did not lead to a happy number; therefore,
#                    we would be computing the same sequence again and again...
#
# - Implementation: Using a "set", we can keep track which numbers which have been been visited
#                   (while taking advantage of O(1) access time).
#
# Returns 1 is a number is a happy number, otherwise 0
def is_happy_num(num, visited=set()):
    if num in visited:
        return 0

    visited.add(num)

    digit_sum = sum_digits_squared(num)
    if digit_sum == 1:
        return 1

    return is_happy_num(digit_sum, visited)


for line in sys.stdin:
    num = int(line.rstrip())

    print(is_happy_num(num))
