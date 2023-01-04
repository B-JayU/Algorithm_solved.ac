import sys

T = int(sys.stdin.readline())
for _ in range(T):
    n = int(sys.stdin.readline())
    dp = [[0 for _ in range(n+1)] for _ in range(3)]

    for i in range(2):
        r = list(map(int, sys.stdin.readline().split(" ")))
        for j in range(n):
            dp[i+1][j+1] = r[j]

    for i in range(1, n+1):
        dp[0][i] = max(dp[1][i-1], dp[2][i-1])

        dp[1][i] += max(dp[0][i-1], dp[2][i-1])
        dp[2][i] += max(dp[0][i-1], dp[1][i-1])
    print(max(dp[1][n], dp[2][n]))