import sys

cnt_party = list(map(int, sys.stdin.readline().split(" ")))[1]
truth = set(list(map(int, sys.stdin.readline().split(" ")))[1:])

party_list = []
tell_lie_party = []

for _ in range(cnt_party):
    party_list.append(set(list(map(int, sys.stdin.readline().split(" ")))[1:]))
    tell_lie_party.append(1)

for _ in range(cnt_party):
    for i in range(len(party_list)):
        if truth.intersection(party_list[i]):
            tell_lie_party[i] = 0
            truth = truth.union(party_list[i])

print(sum(tell_lie_party))