import sys
from collections import deque


def bfs():
    while q:
        num, command = q.popleft()
        if num == B:
            print(command)
            return

        ## D
        n = (2 * num) % 10000
        if not visited[n]:
            visited[n] = True
            q.append((n, command+'D'))
        ## S
        n = (num-1) % 10000
        if not visited[n]:
            visited[n] = True
            q.append((n, command+'S'))
        ## L
        n = (num%1000) * 10 + (num//1000)
        if not visited[n]:
            visited[n] = True
            q.append((n, command + 'L'))
        ## R
        n = (num//10) + (num%10)*1000
        if not visited[n]:
            visited[n] = True
            q.append((n, command + 'R'))


t = int(sys.stdin.readline())
for t in range(1, t+1):
    A, B = list(map(int, sys.stdin.readline().split(" ")))
    visited = [False for _ in range(10000)]
    q = deque([(A, "")])
    bfs()


