def fib(n: int, memo: dict = dict()) -> int:
    if n == 0:
        return 0
    elif n == 1:
        return 1

    if n not in memo:
        memo[n] = fib(n - 1) + fib(n - 2)

    return memo[n]


for n in range(501):
    print(f'{n}: {fib(n)}')
