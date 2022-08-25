import sys

ary_lcs = []
s1 = sys.stdin.readline().rstrip()
s2 = sys.stdin.readline().rstrip()

ary_lcs = [[0 for _ in range(len(s2)+1)] for _ in range(len(s1)+1)]
length_s1 = len(s1)
length_s2 = len(s2)

for i in range(length_s1):
    for j in range(length_s2):
        if s1[i] == s2[j]:
            ary_lcs[i+1][j+1] = ary_lcs[i][j] + 1
        else:
            ary_lcs[i+1][j+1] = max(ary_lcs[i+1][j], ary_lcs[i][j+1])

print(ary_lcs[length_s1][length_s2])




