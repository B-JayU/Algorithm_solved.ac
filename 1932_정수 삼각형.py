import sys
height = int(sys.stdin.readline())
triangle = []
for _ in range(height):
    triangle.append(list(map(int, sys.stdin.readline().split(" "))))

for i in range(height):
    for j in range(len(triangle[i])):
        if i == 0:
            continue
        else:
            if j == 0:
                triangle[i][j] += triangle[i-1][j]
            elif j == len(triangle[i])-1:
                triangle[i][j] += triangle[i-1][j-1]
            else:
                triangle[i][j] += max(triangle[i-1][j-1], triangle[i-1][j])

print(max(triangle[height-1]))