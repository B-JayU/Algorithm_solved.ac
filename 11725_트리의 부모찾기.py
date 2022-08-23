import sys
n = int(sys.stdin.readline())
parent = [0 for _ in range(n+1)]
nodes = [1]

for _ in range(n-1):
    a, b = list(map(int, sys.stdin.readline().split(" ")))
    if a in nodes:
        parent[b]=a
        nodes.append(b)
    elif b in nodes:
        parent[a]=b
        nodes.append(a)

for i in range(2, n+1):
    print(parent[i])

