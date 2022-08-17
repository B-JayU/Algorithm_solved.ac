import sys
from collections import deque

n, k = list(map(int, sys.stdin.readline().split(" ")))
visited = [0 for _ in range(100001)]
q = deque([n])

while q:
    loc = q.popleft()

    if loc == k:
        print(visited[loc])
        break

    for i in range(3):
        if i == 0:
            temp = loc - 1
        elif i == 1:
            temp = loc + 1
        else:
            temp = loc * 2

        if 0 <= temp < 100001 and visited[temp] == 0:
            visited[temp] = visited[loc] + 1
            q.append(temp)





