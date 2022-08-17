import sys
import math
N, r, c = list(map(int, sys.stdin.readline().split(" ")))
size = int(math.pow(2, N))
visited = -1
flag = False


def z(x, y, mx, my, m):
    global visited

    if m == 1:
        visited += 1
        return

    row = 1 if x >= mx else 0
    col = 1 if y >= my else 0
    area = 2*row + col

    visited += (m // 2) * (m // 2) * area

    if area == 0:
        z(x, y, mx - m//4, my - m//4, m//2)
        return
    elif area == 1:
        z(x, y, mx - m//4, my + m//4, m//2)
        return
    elif area == 2:
        z(x, y, mx + m//4, my - m//4, m//2)
        return
    elif area == 3:
        z(x, y, mx + m//4, my + m//4, m//2)
        return


z(r, c, size//2, size//2, size)
print(visited)
