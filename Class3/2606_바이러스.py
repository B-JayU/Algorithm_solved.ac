import sys
from collections import deque

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

network = [[] for _ in range(n+1)]
for _ in range(m):
    e1, e2 = list(map(int, sys.stdin.readline().split(" ")))
    network[e1].append(e2)
    network[e2].append(e1)

q = deque([1])
visited = [1]
addicted = 0


def virus():
    global addicted

    while q:
        cur = q.popleft()

        for p in network[cur]:
            if p not in visited:
                q.append(p)
                visited.append(p)
                addicted += 1


virus()
print(addicted)
