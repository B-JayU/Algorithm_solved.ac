import sys
city = int(sys.stdin.readline())
line = int(sys.stdin.readline())
INF = int(1e9)

cost = [[INF for _ in range(city)] for _ in range(city)]

for i in range(city):
    cost[i][i] = 0

for _ in range(line):
    a, b, c = list(map(int, sys.stdin.readline().split(" ")))
    if cost[a-1][b-1] > c:
        cost[a-1][b-1] = c

for k in range(city):
    for i in range(city):
        for j in range(city):
            cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j])

for i in range(city):
    for j in range(city):
        if cost[i][j] == INF:
            print(0, end=' ')
        else:
            print(cost[i][j], end=' ')
    print()
