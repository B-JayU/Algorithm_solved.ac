import sys

M = int(sys.stdin.readline())
S = set()


for _ in range(M):
    cmd = list(sys.stdin.readline().split())

    if cmd[0] == 'all':
        S = set([i+1 for i in range(20)])
    elif cmd[0] == 'empty':
        S = set()
    else:
        num = int(cmd[1])

        if cmd[0] == 'add':
            S.add(num)
        elif cmd[0] == 'remove':
            S.discard(num)
        elif cmd[0] == 'check':
            if num in S:
                print("1")
            else:
                print("0")
        elif cmd[0] == 'toggle':
            if num is S:
                S.remove(num)
            else:
                S.add(num)

