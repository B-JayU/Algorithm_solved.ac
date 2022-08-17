import sys
N = int(sys.stdin.readline())
route = []
for _ in range(N):
    row = list(map(int, sys.stdin.readline().split(" ")))
    route.append(row)

for k in range(N):
    for i in range(N):
        for j in range(N):

            if route[i][j] == 0:
                if route[i][k] == 1 and route[k][j] == 1:
                    route[i][j] = 1

for i in range(N):
    for j in range(N):
        print(route[i][j], end=" ")
    print()