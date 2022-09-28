import random
import collections


def print_hashmap(hashmap: dict, sort: bool = True) -> None:
    if sort:
        hashmap = dict(sorted(hashmap.items(), key=lambda kv: kv[0]))

    for k, v in hashmap.items():
        print(f'{k}: {v}')
    # print(sorted_hashmap)


def main():
    freq = dict()

    n = 1_000_000
    for _ in range(n):
        # rand = int(random() * 10 + 1)
        rand = random.randrange(1, 101, 2)
        # rand = randint(0, 10, 3)

        if rand not in freq:
            freq[rand] = 0

        freq[rand] += 1

    # print_hashmap(freq)

    nums = []

    for _ in range(n):
        rand = random.randrange(1, 101, 2)
        nums.append(rand)

    freq2 = collections.Counter(nums)
    print_hashmap(freq2)
    print(f'Top 3 Most Common Elements: {freq2.most_common(3)}')
    print(f'Total Count of Elements: {freq2.total():,}')


if __name__ == '__main__':
    main()
