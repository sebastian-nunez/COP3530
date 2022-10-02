# Proper Solution - Amazon SDE Intern Final Interview (09.26.22)
from collections import deque
# Given a sequence of names, find the longest consecutive sub-sequence with no repeats!


def main():
    seq = ['Alice', 'Bob', 'Alice', 'Mac', 'Charlie', 'Charlie']
    print(longestSequence(seq))  # Expects ['Bob', 'Alice', 'Mac', 'Charlie']


def longestSequence(data: list) -> list:
    # Two pointer/sliding window approach
    if len(data) <= 1:
        return data

    result = []

    upper = 0
    max_length = 0
    current_length = 0

    people = dict()  # O(1) access and removal (maintains the order)
    while upper < len(data):  # O(n) complexity (you only pass each person ONCE)
        person = data[upper]

        if person in people:
            current_length = len(people)

            if current_length > max_length:
                max_length = current_length
                result = list(people.keys())

            people.pop(person)
        else:
            people[person] = None
            upper += 1

    if len(people) > max_length:  # if the result is the last sequence
        result = list(people.keys())

    return result


if __name__ == '__main__':
    main()
