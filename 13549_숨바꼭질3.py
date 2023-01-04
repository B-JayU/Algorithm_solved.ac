import sys
from collections import deque

subin, bro = list(map(int, sys.stdin.readline().split(" ")))
dist = [-1 for i in range(100001)]
dist[subin] = 0
q = deque()

if subin > bro:
    print(subin-bro)
else:
    q.append(subin)
    while q:
        cur = q.popleft()

        if cur == bro:
            print(dist[cur])
            break

        if cur * 2 <= 100000 and dist[cur*2] == -1:
            dist[cur*2] = dist[cur]
            q.appendleft(cur*2)
        if cur + 1 <= 100000 and dist[cur+1] == -1:
            dist[cur+1] = dist[cur] + 1
            q.append(cur+1)
        if cur - 1 >= 0 and dist[cur-1] == -1:
            dist[cur-1] = dist[cur] + 1
            q.append(cur-1)
