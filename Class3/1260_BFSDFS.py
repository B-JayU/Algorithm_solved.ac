import sys
from collections import deque

n, m, v = list(map(int, sys.stdin.readline().split()))

visited = [0 for _ in range(n)]
graph = [[0 for _ in range(n)] for _ in range(n)]

res_bfs = []

# Generate graph
for _ in range(m):
    s, d = list(map(int, sys.stdin.readline().split()))
    graph[s-1][d-1] = 1
    graph[d-1][s-1] = 1


def dfs(start):

    visited[start-1] = 1
    print(start, end=" ")

    for des in range(n):
        if graph[start-1][des] == 1:
            if visited[des] == 0:
                dfs(des+1)


def bfs(vertex):
    queue = deque([])
    visit = []
    queue.append(vertex)
    visit.append(vertex)

    while queue:
        vt = queue.popleft()
        print(vt, end=" ")
        for des in range(n):
            if graph[vt-1][des] == 1:
                if des+1 not in visit:
                    queue.append(des+1)
                    visit.append(des+1)

    return visit


dfs(v)
print()
bfs(v)