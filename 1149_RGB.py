import sys
n = int(sys.stdin.readline())
RGB_cost = []
for _ in range(n):
    cost = list(map(int, sys.stdin.readline().split(" ")))
    RGB_cost.append(cost)

for i in range(1, n):
    RGB_cost[i][0] = min(RGB_cost[i-1][1], RGB_cost[i-1][2]) + RGB_cost[i][0]
    RGB_cost[i][1] = min(RGB_cost[i-1][0], RGB_cost[i-1][2]) + RGB_cost[i][1]
    RGB_cost[i][2] = min(RGB_cost[i-1][0], RGB_cost[i-1][1]) + RGB_cost[i][2]

res = min(RGB_cost[n-1])
print(res)




