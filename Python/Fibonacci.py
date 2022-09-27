def main():
    # Fib: 0 1 1 2 3 5 8 13 21
    # for n in range(100):
    #     print(fib_memo(n), end=' ')
    # print('\n')
    # for n in range(50):
    #     print(fib(n), end=' ')

    print(f'Fib Memoized: {fib_memo(800):,}')
    print()
    # print(f'Fib Regular: {fib(40):,}')


def fib(n: int) -> int:
    assert n >= 0, 'n must be postitive!'

    if n == 0:
        return 0
    if n == 1 or n == 2:
        return 1

    return fib(n - 1) + fib(n - 2)


def fib_memo(n: int, memo=dict()) -> int:
    assert n >= 0, 'n must be postitive!'

    if n == 0:
        return 0
    if n == 1 or n == 2:
        return 1

    if n not in memo:
        memo[n] = fib_memo(n - 1, memo) + fib_memo(n - 2, memo)

    return memo[n]


if __name__ == '__main__':
    main()
