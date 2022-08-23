import sys
n, m = list(map(int, sys.stdin.readline().split(" ")))

board = []
for _ in range(n):
    board.append(list(map(int, sys.stdin.readline().split(" "))))

for i in range(1, n):
    board[0][i] += board[0][i-1]
    board[i][0] += board[i-1][0]

for i in range(1,n):
    for j in range(1,n):
        board[i][j] += board[i-1][j] + board[i][j-1] - board[i-1][j-1]


for _ in range(m):
    startx, starty, endx, endy = list(map(int, sys.stdin.readline().split(" ")))
    startx -= 1; starty -= 1; endx -= 1; endy -= 1

    ret = 0
    if startx > 0 and starty > 0:
        ret = board[endx][endy] - board[endx][starty-1] - board[startx-1][endy] + board[startx-1][starty-1]
    elif startx > 0:
        ret = board[endx][endy] - board[startx-1][endy]
    elif starty > 0:
        ret = board[endx][endy] - board[endx][starty-1]
    else:
        ret = board[endx][endy]

    print(ret)

