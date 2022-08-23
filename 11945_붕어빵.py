import sys
n, m = list(map(int, sys.stdin.readline().split(" ")))
boong = []
for _ in range(n):
    boong.append(list(sys.stdin.readline().rstrip()))

for i in range(n):
    for j in range(m-1, -1, -1):
        print(boong[i][j], end="")
    print()


