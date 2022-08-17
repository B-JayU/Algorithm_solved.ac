import sys
from collections import deque
N,M = list(map(int ,sys.stdin.readline().split()))

connect = [[0 for _ in range(N+1)] for _ in range(N+1)]
visited = [0 for _ in range(N+1)]
q = deque([])

for _ in range(M):
    u, v = list(map(int, sys.stdin.readline().split()))
    connect[u][v] = 1
    connect[v][u] = 1

num_conn_elem = 0

for i in range(1, N+1):

    if visited[i] == 0:
        q.append(i)
        num_conn_elem += 1

    while q:
        start = q.popleft()
        visited[start] = 1

        for j in range(1, N+1):
            if connect[start][j] == 1 and visited[j] == 0:
                q.append(j)
                visited[j] = 1

print(num_conn_elem)


