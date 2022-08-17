import sys

height = int(sys.stdin.readline())
stairs = [0]
for _ in range(height):
    stairs.append(int(sys.stdin.readline()))

points = [0 for i in range(height+1)]
points[1] = stairs[1]
if height == 2:
    points[2] = stairs[1] + stairs[2]
if height >= 3:
    points[2] = stairs[1] + stairs[2]
    points[3] = max(stairs[1]+stairs[3], stairs[2]+stairs[3])
    for i in range(4, height+1):
        points[i] = max(points[i-2] + stairs[i], points[i-3] + stairs[i-1] + stairs[i])

print(points[height])


