import sys

zero = [0 for _ in range(41)]
one = [0 for _ in range(41)]

zero[0] = 1
one[1] = 1

for j in range(2, 41):
    zero[j] = zero[j-1] + zero[j-2]
    one[j] = one[j - 1] + one[j - 2]

t = int(sys.stdin.readline())
for _ in range(t):
    num = int(sys.stdin.readline())
    print(zero[num], one[num])