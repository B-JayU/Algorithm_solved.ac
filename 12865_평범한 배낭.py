import sys
n, k = list(map(int, sys.stdin.readline().split(" ")))

weight = []
value = []
max_val = 0
knapsack = [[0 for _ in range(k+1)] for _ in range(n+1)]
for _ in range(n):
    w, v = list(map(int, sys.stdin.readline().split(" ")))
    weight.append(w)
    value.append(v)

"""
def knapsack(idx, w, v):
    global max_val

    if idx == n:
        return

    if v > max_val:
        max_val = v

    if w + weight[idx] <= k:
        knapsack(idx+1, w+weight[idx], v+value[idx])
    knapsack(idx+1, w, v)
"""

for i in range(1, n+1):
    for j in range(1, k+1):
        if weight[i-1] > j:
            knapsack[i][j] = knapsack[i-1][j]
        else:
            knapsack[i][j] = max(knapsack[i-1][j-weight[i-1]] + value[i-1], knapsack[i-1][j])
print(knapsack[n][k])



