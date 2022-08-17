import sys
n, m = list(map(int, sys.stdin.readline().split()))

no_hear = set([])
no_see = set([])

for _ in range(n):
    no_hear.add(sys.stdin.readline().rstrip())
for _ in range(m):
    no_see.add(sys.stdin.readline().rstrip())

ret = sorted(no_hear.intersection(no_see))

print(len(ret))
for name in ret:
    print(name)