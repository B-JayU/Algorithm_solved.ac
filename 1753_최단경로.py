import heapq
import sys

INF = sys.maxsize
input = sys.stdin.readline


def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0
    while q:
        d, now = heapq.heappop(q)
        if distance[now] < d:
            continue
        for v, w in graph[now]:
            cost = d + w
            if cost < distance[v]:
                distance[v] = cost
                heapq.heappush(q, (cost, v))


N, M = list(map(int, sys.stdin.readline().split(" ")))
graph = [[] for _ in range(N + 1)]
distance = [INF] * (N + 1)
start = int(input())
for _ in range(M):
    a, b, w = map(int, sys.stdin.readline().split(" "))
    graph[a].append((b, w))
dijkstra(start)

for i in range(1, N+1):
    if distance[i] == INF:
        print('INF')
        continue
    print(distance[i])