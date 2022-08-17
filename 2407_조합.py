import math
import sys

n, m = list(map(int, sys.stdin.readline().split(" ")))
print(math.comb(n, m))