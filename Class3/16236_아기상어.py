import sys
from collections import deque

n = int(sys.stdin.readline())
ocean = []
size = 2
eat_cnt = 0

for i in range(n):
    r = list(map(int, sys.stdin.readline().split(" ")))
    ocean.append(r)
    if 9 in r:
        x = i
        y = r.index(9)
        ocean[x][y] = 0

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


def fishing(r, c, s):
    visited = [[0]*n for _ in range(n)]
    distance = [[0]*n for _ in range(n)]
    q = deque()
    q.append((r, c))
    visited[r][c] = 1
    temp = []

    while q:
        cx, cy = q.popleft()
        for i in range(4):
            nx = cx + dx[i]
            ny = cy + dy[i]

            if 0 <= nx < n and 0 <= ny < n and visited[nx][ny] == 0:
                if ocean[nx][ny] <= s: # 지나갈 수 있는 경로 인가?
                    q.append((nx, ny))
                    visited[nx][ny] = 1
                    distance[nx][ny] = distance[cx][cy] + 1
                    if 0 < ocean[nx][ny] < s: # 그 중 에서도 잡아 먹을 수 있는 물고기 가 있는 위치 인가?
                        temp.append((nx, ny, distance[nx][ny]))

    return sorted(temp, key=lambda e: (e[2], e[0], e[1]))


cur_x, cur_y = x, y
second = 0
eat_cnt = 0

while True:
    eatable_fish = fishing(x, y, size)

    if len(eatable_fish) == 0:
        break
    x, y, dist = eatable_fish.pop(0)
    ocean[x][y] = 0
    second += dist
    eat_cnt += 1

    if eat_cnt == size:
        eat_cnt = 0
        size += 1

print(second)

