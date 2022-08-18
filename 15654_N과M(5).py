import sys
n, m = list(map(int, sys.stdin.readline().split(" ")))
num = list(map(int, sys.stdin.readline().split(" ")))
num.sort()
seq = []


def n_m5():
    if len(seq) == m:
        for val in seq:
            print(val, end=" ")
        print()

    for i in num:
        if i not in seq:
            seq.append(i)
            n_m5()
            seq.pop()


n_m5()







