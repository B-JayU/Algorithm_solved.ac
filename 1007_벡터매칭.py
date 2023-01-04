import sys
import math

x_coor = []
y_coor = []
sum_x = sum_y = 0


def comb(cnt, idx, subx, suby):
    global min_v, n
    if cnt == 0:
        comp_min = math.sqrt((sum_x - 2*subx)**2 + (sum_y -2*suby)**2)
        if min_v > comp_min:
            min_v = comp_min
        return

    if idx >= n:
        return

    comb(cnt-1, idx+1, subx+x_coor[idx], suby+y_coor[idx])
    comb(cnt, idx+1, subx, suby)


test_case = int(sys.stdin.readline())
for t in range(test_case):

    min_v = 200000 * math.sqrt(2)
    x_coor = []
    y_coor = []
    sum_x = sum_y = 0

    n = int(sys.stdin.readline())
    for i in range(n):
        x, y = list(map(int, sys.stdin.readline().split(" ")))
        x_coor.append(x)
        y_coor.append(y)
        sum_x += x
        sum_y += y

    comb(n//2, 0, 0, 0)
    print('{:.12f}'.format(min_v))
