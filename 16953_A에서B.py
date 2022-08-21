import sys
a, b = list(map(int, sys.stdin.readline().split(" ")))

cnt_cal = 0
while b > a:
    if b % 10 == 1:
        b //= 10
        cnt_cal += 1
    elif b % 2 == 0:
        b //= 2
        cnt_cal += 1
    else:
        break

if b == a:
    print(cnt_cal + 1)
else:
    print(-1)