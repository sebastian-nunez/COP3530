# Amazon SDE Intern Final Interview (09.26.22)

# Given a sequence of names, find the longest consecutive sub-sequence with no repeats!
def main():
    seq = ['Alice', 'Bob', 'Alice', 'Charlie']
    print(longestSequence(seq))  # Expects ["Bob", "Alice", "Charlie"]


def longestSequence(data: list) -> list:
    # Two pointer/sliding window approach
    if len(data) <= 1:
        return data

    result = []

    lower = 0
    upper = 1
    max_length = 1
    current_length = 1

    # FIXME: should've used a HASHMAP to preserve order O(1) insert/delete!
    people = set([data[0]])

    while upper < len(data):  # O(n) complexity (you only pass each person ONCE)
        person = data[upper]

        if person in people:
            current_length = len(people)

            if current_length > max_length:
                max_length = current_length
                result = list(people)

            people.remove(person)  # FIXME: incorrect level of indetation
            lower += 1  # FIXME: lower pointer not needed since we remove the duplicate directly

        people.add(person)
        upper += 1

    if len(people) > max_length:  # FIXME: missing edge case (last sequence is correct)!
        result = list(people)

    return result


if __name__ == '__main__':
    main()
