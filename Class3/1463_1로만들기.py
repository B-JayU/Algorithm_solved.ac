import sys
x = int(sys.stdin.readline())
cal = [0 for _ in range(1000001)]

for i in range(2, x+1):
    if i % 2 == 0 and i % 3 == 0:
        cal[i] = min(cal[i//2], cal[i//3], cal[i-1]) + 1
    elif i % 2 == 0:
        cal[i] = min(cal[i//2], cal[i-1]) + 1
    elif i % 3 == 0:
        cal[i] = min(cal[i//3], cal[i-1]) + 1
    else:
        cal[i] = cal[i-1] + 1

print(cal[x])

