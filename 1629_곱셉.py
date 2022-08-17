import sys
a, b, c = list(map(int, sys.stdin.readline().split(" ")))


def multiple(num, n):
    if n == 1:
        return num % c

    tmp = multiple(num, n // 2)
    if n % 2 == 0:
        return (tmp * tmp) % c
    else:
        return (num * tmp * tmp) % c


ret = multiple(a, b)
print(ret)