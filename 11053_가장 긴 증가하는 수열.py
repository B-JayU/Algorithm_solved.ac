import sys
n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split(" ")))
upper = [1 for _ in range(n)]

for i in range(1, n):
    for j in range(i):
        if a[i] > a[j]:
            upper[i] = max(upper[i], upper[j]+1)
ret = max(upper)
print(ret)
