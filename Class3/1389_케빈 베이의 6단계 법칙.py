import sys
N, M = list(map(int, sys.stdin.readline().split(" ")))

graph = [[100 for _ in range(N)] for _ in range(N)]
for _ in range(M):
    A, B = list(map(int, sys.stdin.readline().split(" ")))
    graph[A-1][B-1] = 1
    graph[B-1][A-1] = 1

for k in range(N):
    for i in range(N):
        for j in range(N):
            if graph[i][k] + graph[k][j] < graph[i][j]:
                graph[i][j] = graph[i][k] + graph[k][j]

result = []
for i in range(N):
    sum = 0
    for j in range(N):
        if graph[i][j] < 100:
            sum += graph[i][j]

    result.append((sum, i+1))

result.sort(key=lambda x: (x[0], x[1]))
print(result[0][1])
