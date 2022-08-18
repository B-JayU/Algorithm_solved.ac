import sys
n, m = list(map(int, sys.stdin.readline().split(" ")))
seq = []


def dfs(start):
    if len(seq) == m:
        for val in seq:
            print(val, end=" ")
        print()
        return

    for i in range(start, n+1):
        seq.append(i)
        dfs(i)
        seq.pop()


dfs(1)


