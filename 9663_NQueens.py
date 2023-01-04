import itertools
import sys

n = int(sys.stdin.readline())
n_queen = [0] * n
cnt_solved = 0

def promissing(v):
    for i in range(v):
        if n_queen[i] == n_queen[v] or abs(i-v) == abs(n_queen[i]-n_queen[v]):
            return False
    return True

def find_n_queen(v):
    global cnt_solved
    if v == n:
        cnt_solved += 1
        return

    for i in range(n):
        n_queen[v] = i

        if promissing(v):
            find_n_queen(v+1)


find_n_queen(0)
print(cnt_solved)