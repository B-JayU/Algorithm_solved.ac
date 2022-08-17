import sys
t = int(sys.stdin.readline())
for t in range(1,t+1):
    A, B = list(map(int, sys.stdin.readline().split(" ")))
    print("Case #{0}: {1} + {2} = {3}".format(t, A, B, A+B))