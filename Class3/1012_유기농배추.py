import sys
from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

T = int(sys.stdin.readline())
q = deque([])

for _ in range(T):
    M, N, K = list(map(int, sys.stdin.readline().split(" ")))
    vegetable = [[0 for _ in range(N)] for _ in range(M)]
    visited = [[0 for _ in range(N)] for _ in range(M)]

    for _ in range(K):
        x, y = list(map(int, sys.stdin.readline().split(" ")))
        vegetable[x][y] = 1

    num_conn_elem = 0
    for i in range(0, M):
        for j in range(0, N):

            if vegetable[i][j] == 1 and visited[i][j] == 0:
                q.append((i, j))
                num_conn_elem += 1

            while q:
                x, y = q.popleft()
                visited[x][y] = 1

                for j in range(4):
                    nx = x + dx[j]
                    ny = y + dy[j]

                    if nx < 0 or nx >= M or ny < 0 or ny >= N:
                        continue

                    if vegetable[nx][ny] == 1 and visited[nx][ny] == 0:
                        q.append((nx, ny))
                        visited[nx][ny] = 1

    print(num_conn_elem)

