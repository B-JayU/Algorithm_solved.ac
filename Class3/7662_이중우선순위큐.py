import sys
import heapq
t = int(input())
minheap = []

for i in range(t):
    cnt = 0
    k = int(input())
    for j in range(k):
        cmd, num = list(sys.stdin.readline().split())
        num = int(num)
        if cmd == 'I':
            heapq.heappush(minheap, num)
        if cmd == 'D':
            if minheap:
                if num == 1:
                    minheap.remove(heapq.nlargest(1, minheap)[0])
                elif num == -1:
                    heapq.heappop(minheap)

    if minheap:
        print(heapq.nlargest(1, minheap)[0], end=" ")
        print(heapq.heappop(minheap))
    else:
        print("EMPTY")
