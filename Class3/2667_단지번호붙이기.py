from collections import deque

n = int(input())
ground = []
for i in range(n):
    ground.append(list(map(int, input())))
visited = [[0 for c in range(n)] for r in range(n)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


def apartment (x, y, c):
    visited[x][y] = 1

    global nums
    if ground[x][y] == 1:
        nums += 1

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue

            if visited[nx][ny] == 0 and ground[nx][ny] == 1:
                apartment(nx, ny, cnt)


cnt = 1
nums = 0
numlist = []
for a in range(n):
    for b in range(n):
        if ground[a][b] == 1 and visited[a][b] == 0:
            apartment(a, b, cnt)
            numlist.append(nums)
            nums = 0
            cnt += 1

length = len(numlist)
numlist.sort()
print(length)
for i in range(length):
    print(numlist[i])
