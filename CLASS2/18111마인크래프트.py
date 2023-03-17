import sys

N,M,B = map(int, sys.stdin.readline().split())

ans_height = 0
ans_time = sys.maxsize

craft = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

for target in range(257):

    up = 0; down = 0
    for r in range(N):
        for c in range(M):

            if craft[r][c] < target:
                up += target - craft[r][c]
            else:
                down += craft[r][c] - target

    if up > (B + down):
        continue

    time = up * 1 + down * 2
    if time <= ans_time:
        ans_time = time
        ans_height = target

print(ans_time, ans_height)