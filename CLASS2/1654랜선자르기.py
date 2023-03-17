import sys

k,n = map(int, sys.stdin.readline().split())
Lan = [int(sys.stdin.readline()) for i in range(k)]

low = 1
high = max(Lan)
ans = 0

while low <= high:
    cnt = 0
    mid = (low + high) // 2
    for i in range(k):
        cnt += Lan[i] // mid

    if cnt >= n:
        low = mid + 1
        if ans < mid:
            ans = mid
    else:
        high = mid - 1

print(ans)