import sys
import heapq

n = int(sys.stdin.readline())

t = []
for _ in range(n):
    num = int(sys.stdin.readline())
    if num > 0:
        heapq.heappush(t, num)
    elif num == 0:
        if len(t) > 0:
            print(heapq.heappop(t))
        else:
            print('0')

