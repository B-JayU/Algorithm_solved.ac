import sys
from collections import deque

M, N, H = list(map(int, sys.stdin.readline().split(" ")))
tomato = []
q0 = []
q1 = []
for h in range(H):
    floor = []
    for n in range(N):
        row = list(map(int, sys.stdin.readline().split(" ")))
        floor.append(row)
        for m in range(M):
            if row[m] == 1:
                q1.append((h, n, m, 0))

    tomato.append(floor)


dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
dh = [-1, 1]
min_day = 0


def check():
    for i in range(H):
        for j in range(N):
            if 0 in tomato[i][j]:
                print("-1")
                return
    else:
        print(min_day)


q = deque(q1)
while q:
    t = q.popleft();
    flag = True

    count_1 = 0
    if min_day < t[3]:
        min_day = t[3]

    for d in range(4):
        nx = t[1] + dx[d]
        ny = t[2] + dy[d]
        nd = t[3] + 1

        if nx < 0 or nx >= N or ny < 0 or ny >= M:
            continue

        if tomato[t[0]][nx][ny] == 0:
            tomato[t[0]][nx][ny] = 1
            q.append((t[0], nx, ny, nd))

    for d in range(2):
        nh = t[0] + dh[d]

        if nh < 0 or nh >= H:
            continue

        if tomato[nh][t[1]][t[2]] == 0:
            tomato[nh][t[1]][t[2]] = 1
            q.append((nh, t[1], t[2], t[3]+1))

check()


