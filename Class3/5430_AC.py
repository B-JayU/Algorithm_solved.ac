import sys
t = int(sys.stdin.readline())

for _ in range(t):
    p = sys.stdin.readline().rstrip()
    n = int(sys.stdin.readline())

    x = sys.stdin.readline().rstrip()
    if x != '[]':
        x = list(map(int, x[1:len(x)-1].split(',')))
    else:
        x = []

    r = 0
    flag = True
    for c in p:
        if c == 'R':
            r += 1
            check = r % 2
        elif c == 'D':
            if len(x) == 0:
                flag = False
                break
            if check == 0:
                del x[0]
            else:
                del x[-1]

    if flag:
        if check == 0:
            print(str(x).replace(" ", ""))
        else:
            print(str(x[::-1]).replace(" ", ""))
    else:
        print('error')