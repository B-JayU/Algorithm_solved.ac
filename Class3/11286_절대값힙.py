import sys
import heapq

N = int(sys.stdin.readline())
heap = []
for _ in range(N):
    num = int(sys.stdin.readline())

    if num != 0:
        heapq.heappush(heap, (abs(num), num))
    else:
        if heap:
            a, v = heapq.heappop(heap)
            print(v)
        else:
            print(0)