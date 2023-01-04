import sys

tc = int(sys.stdin.readline())
INF = int(1e9)


def search(start):
    dist[start] = 0

    for a in range(n):
        for edge in edges:
            cur = edge[0]
            next_node = edge[1]
            cost = edge[2]

            if dist[next_node] > dist[cur] + cost:
                dist[next_node] = dist[cur] + cost
                if a == n - 1:
                    return True
    return False


for i in range(tc):
    edges = []
    n, m, w = map(int, sys.stdin.readline().split())
    dist = [INF] * (n + 1)

    for j in range(m):
        s, e, t = map(int, sys.stdin.readline().split())
        edges.append((s, e, t))
        edges.append((e, s, t))
    for j in range(w):
        s, e, t = map(int, sys.stdin.readline().split())
        edges.append((s, e, -t))

    res = search(1)

    if res:
        print("YES")
    else:
        print("NO")
