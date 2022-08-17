import sys
from collections import deque

N = int(sys.stdin.readline())

global visited
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
color = [[['R'], ['G'], ['B']], [['R', 'G'], ['B']]]

result = [[0 for _ in range(3)], [0 for _ in range(2)]]
board = [list(sys.stdin.readline()) for _ in range(N)]
global queue


def init():
    global visited, queue
    visited = [[0 for _ in range(N)] for _ in range(N)]
    queue = deque([])


def area(tc, index):

    while queue:
        r, c = queue.popleft()

        for d in range(4):
            nr = r + dx[d]
            nc = c + dy[d]
            if nr < 0 or nr >= N or nc < 0 or nc >= N:
                continue

            if visited[nr][nc] == 0 and board[nr][nc] in color[tc][index]:
                visited[nr][nc] = 1
                queue.append((nr, nc))


for t in range(2):
    init()
    for i in range(N):
        for j in range(N):
            if visited[i][j] == 0:
                visited[i][j] = 1
                queue.append((i, j))
                for idx in range(len(color[t])):
                    if board[i][j] in color[t][idx]:
                        idx_group = idx
                        area(t, idx)
                        result[t][idx] += 1
                        break


print(sum(result[0]), sum(result[1]))
