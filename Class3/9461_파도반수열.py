T = int(input())

pn = [0, 1, 1]

for t in range(T):
    n = int(input())

    if n >= 3:
        cur = len(pn)
        if cur <= n:
            for i in range(cur, n+1):
                pn.append(pn[i-2]+pn[i-3])

    print(pn[n])