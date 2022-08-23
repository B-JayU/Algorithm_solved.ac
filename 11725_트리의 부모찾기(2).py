import sys
sys.setrecursionlimit(10**6)
n = int(sys.stdin.readline())
parent = [0 for _ in range(n+1)]

tree = [[] for _ in range(n+1)]

for _ in range(n-1):
    a, b = list(map(int, sys.stdin.readline().split(" ")))
    tree[a].append(b)
    tree[b].append(a)


def dfs(idx):
    for i in tree[idx]:
        if parent[i] == 0:
            parent[i] = idx
            dfs(i)


dfs(1)
for i in range(2, n+1):
    print(parent[i])