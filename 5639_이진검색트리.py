import sys
sys.setrecursionlimit(10 ** 6)

num_list = []
while True:
    try:
        num = int(sys.stdin.readline().rstrip())
        num_list.append(num)
    except EOFError:
        break


def postorder(start, end):

    if start > end:
        return
    temp = end + 1

    #루트를 기준으로, 작은값들은 left_subtree, 큰 값들은 right_subtree
    for i in range(start+1, end+1):
        if num_list[start] < num_list[i]:
            temp = i
            break

    postorder(start+1, temp-1)
    postorder(temp, end)
    print(num_list[start])


postorder(0, len(num_list)-1)
