import sys
n, m = list(map(int, sys.stdin.readline().split(" ")))
num = list(map(int, sys.stdin.readline().split(" ")))
num.sort()
seq = []


def n_m8(start):
    if len(seq) == m:
        for val in seq:
            print(val, end=" ")
        print()
        return

    for i in range(start, len(num)):
        seq.append(num[i])
        n_m8(i)
        seq.pop()


n_m8(0)







