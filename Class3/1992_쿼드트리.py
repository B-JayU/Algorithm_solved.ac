import sys

n = int(sys.stdin.readline())
board = [list(map(int, list(input().strip()))) for _ in range(n)]


def quard(startx, starty, size):

    flag = True
    check = board[startx][starty]

    for i in range(size):
        for j in range(size):
            if board[startx + i][starty + j] != check:
                flag = False
                break

    if not flag:
        print("(", end="")
        size //= 2
        quard(startx, starty, size)
        quard(startx, starty + size, size)
        quard(startx + size, starty, size)
        quard(startx + size, starty + size, size)
        print(")", end="")

    if flag:
        print(check, end="")


quard(0, 0, n)
