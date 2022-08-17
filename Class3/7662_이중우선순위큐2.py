import sys
import heapq
t = int(input())
maxheap = []
minheap = []
cnt = 0

for i in range(t):
    cnt = 0
    k = int(input())
    for j in range(k):
        cmd, num = list(sys.stdin.readline().split())
        num = int(num)
        if cmd == 'I':
            heapq.heappush(minheap, num)
            heapq.heappush(maxheap, (-1)*num)
            cnt += 1
        if cmd == 'D':
            if cnt != 0:
                if num == 1:
                    temp = heapq.heappop(maxheap)
                    # search = (-1)*temp
                    # minheap.remove((-1)*temp)
                    for k in range(len(minheap) // 2-1, len(minheap)):
                        if minheap[k] == (-1)*temp:
                            del minheap[k]
                            break
                    cnt -= 1
                if num == -1:
                    temp = heapq.heappop(minheap)
                    #.remove((-1)*temp)
                    for k in range(len(minheap) // 2-1, len(minheap)):
                        if minheap[k] == (-1)*temp:
                            del minheap[k]
                            break
                    cnt -= 1

    if cnt == 0:
        print("EMPTY")
    else:
        print((-1) * heapq.heappop(maxheap), end=" ")
        print(heapq.heappop(minheap))


a,b = list(map(int, sys.stdin.readline().split()))
