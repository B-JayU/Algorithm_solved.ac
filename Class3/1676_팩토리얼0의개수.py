import sys
n = int(sys.stdin.readline())

cnt0 = 0
for i in range(0, n+1, 5):
    cur = i
    while cur != 0 and cur%5 == 0:
        cnt0 += 1
        cur //=5

print(cnt0)