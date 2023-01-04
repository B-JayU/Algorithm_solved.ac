import sys
b1 = sys.stdin.readline()
b2 = sys.stdin.readline()
ans = bin(int(b1, 2) * int(b2, 2))[2:]
print(ans)