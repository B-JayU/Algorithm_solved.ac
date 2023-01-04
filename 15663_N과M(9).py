import sys


def dfs(depth):
    if depth == m:
        s = ' '.join(map(str, li))
        if s not in d:
            d[s] = 1
            print(s)
        return

    for i in range(n):
        if check[i]:
            continue

        li.append(nums[i])
        check[i] = 1
        dfs(depth+1)
        li.pop()
        check[i] = 0


n, m = list(map(int, sys.stdin.readline().split(" ")))
nums = sorted(list((map(int, sys.stdin.readline().split(" ")))))
d = {}; li = []
check = [0] * n
dfs(0)
