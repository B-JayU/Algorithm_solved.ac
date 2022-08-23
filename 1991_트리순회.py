import sys
n = int(sys.stdin.readline())
tree = {}
for _ in range(n):
    node, lchild, rchild = list(sys.stdin.readline().rstrip().split(" "))
    tree[node] = [lchild, rchild]


def preorder(item):
    print(item, end="")
    if tree[item][0] != '.':
        preorder(tree[item][0])
    if tree[item][1] != '.':
        preorder(tree[item][1])


def inorder(item):
    if tree[item][0] != '.':
        inorder(tree[item][0])
    print(item, end="")
    if tree[item][1] != '.':
        inorder(tree[item][1])


def postorder(item):
    if tree[item][0] != '.':
        postorder(tree[item][0])
    if tree[item][1] != '.':
        postorder(tree[item][1])
    print(item, end="")


func_name = [preorder, inorder, postorder]
for i in range(3):
    f = func_name[i]
    f('A')
    print()