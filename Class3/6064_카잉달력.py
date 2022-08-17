import sys


def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a%b)


T = int(sys.stdin.readline())
for _ in range(T):
    m, n, x, y = list(map(int, sys.stdin.readline().split(" ")))
    find = False

    k = 0
    a = m
    b = n

    if a < b:
        a, b = b, a

    g = gcd(a, b)
    lcm = g * a//g * b//g

    while k <= lcm//m:
        sol = m * k + x - y
        if sol % n == 0:
            find = True
            sol += y
            break
        k += 1

    if find:
        print(sol)
    else:
        print("-1")