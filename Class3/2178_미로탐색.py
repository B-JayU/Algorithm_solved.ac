import sys
from collections import deque

n, m = list(map(int, sys.stdin.readline().split(" ")))
miro = []

for _ in range(0, n):
    miro.append(list(map(int, sys.stdin.readline().rstrip())))

q = deque([])
q.append((0, 0, 1))
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
visited = [(0, 0)]


def find_miro():
    while q:
        x, y, sec = q.popleft()

        if x == (n-1) and y == (m-1):
            return sec

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if miro[nx][ny] != 0 and (nx, ny) not in visited:
                q.append((nx, ny, sec+1))
                visited.append((nx, ny))


ret = find_miro()
print(ret)


