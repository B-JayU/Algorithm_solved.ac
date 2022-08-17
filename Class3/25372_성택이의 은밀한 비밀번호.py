import sys
t = int(sys.stdin.readline())
for _ in range(t):
    key = sys.stdin.readline().rstrip()
    length = len(key)
    if 6 <= length <= 9:
        print("yes")
    else:
        print("no")