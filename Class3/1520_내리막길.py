import sys
sys.setrecursionlimit(10000)
M, N = list(map(int, sys.stdin.readline().split(" ")))

tour_map = []
for _ in range(M):
    row = list(map(int, sys.stdin.readline().split(" ")))
    tour_map.append(row)

dp = [[-1 for _ in range(N)] for _ in range(M)]
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


def route(x, y):
    if x == M-1 and y == N-1:
        return 1

    if dp[x][y] != -1:
        return dp[x][y]

    ways = 0
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or nx >= M or ny < 0 or ny >= N:
            continue

        if tour_map[x][y] > tour_map[nx][ny]:
            ways += route(nx, ny)
    dp[x][y] = ways
    return dp[x][y]


print(route(0, 0))