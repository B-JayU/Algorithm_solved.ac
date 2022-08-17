import sys
N = int(sys.stdin.readline())

for t in range(1, N+1):
    a, b = list(map(int, sys.stdin.readline().split(" ")))
    print("Case #{0}: {1}".format(t, a+b))