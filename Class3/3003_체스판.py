import sys

chess = [1, 1, 2, 2, 2, 8]
input = list(map(int, sys.stdin.readline().split(" ")))
result = []
for i in range(6):
    print(chess[i] - input[i], end=" ")
