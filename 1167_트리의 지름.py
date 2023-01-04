import sys
n = int(sys.stdin.readline())
tree = [[] for _ in range(n+1)]
res1 = [0] * (n+1)
res2 = [0] * (n+1)


def dfs(cur, res):
    for r in range(len(tree[cur])):
        end, dis = tree[cur][r]
        if res[end] == 0:
            res[end] = res[cur]+dis
            dfs(end, res)


for _ in range(n):
    dist_v = list(map(int, sys.stdin.readline().split(" ")))
    a = dist_v[0]
    for i in range(1, len(dist_v), 2):
        b = dist_v[i]
        if b != -1:
            c = dist_v[i+1]
            tree[a].append((b, c))

dfs(1, res1)
res1[1] = 0

max_dist = 0
max_idx = 0
for i in range(1, len(res1)):
    if max_dist < res1[i]:
        max_dist = res1[i]
        max_idx = i

dfs(max_idx, res2)
res2[max_idx] = 0
print(max(res2))
