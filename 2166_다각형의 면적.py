import sys
n = int(sys.stdin.readline())
coord_x = []
coord_y = []

for _ in range(n):
    x, y = list(map(int, sys.stdin.readline().split(" ")))
    coord_x.append(x)
    coord_y.append(y)

coord_x.append(coord_x[0])
coord_y.append(coord_y[0])

cal = 0
for i in range(n):
    cal += (coord_x[i] * coord_y[i+1]) - (coord_x[i+1] * coord_y[i])

print("{:.1f}".format(abs(cal) * 0.5))
