def main():
    seq = ['Alice', 'Bob', 'Alice', 'Charlie']

    print(longestSeq(seq))


def longestSeq(data: list) -> list:
    result = []

    lower = 0
    upper = 1
    max_length = 1
    current_length = 1
    people = set([data[0]])

    while upper < len(data):
        person = data[upper]

        if person in people:
            current_length = len(people)

            if current_length > max_length:
                max_length = current_length
                result = list(people)
                people.remove(person)
                lower += 1

        people.add(person)
        upper += 1

    return result


if __name__ == '__main__':
    main()
