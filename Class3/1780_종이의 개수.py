import sys
size = int(sys.stdin.readline())

board = []
minus = zero = plus = 0
for _ in range(size):
    list1 = list(map(int, sys.stdin.readline().split(" ")))
    board.append(list1)


def check(r, c, w):
    flag = board[r][c]

    for i in range(r, r+w):
        for j in range(c, c+w):
            if flag != board[i][j]:
                return False
    return True


def partition(row, col, width):
    global minus, plus, zero
    det = check(row, col, width)

    if det:
        if board[row][col] == -1:
            minus += 1
        elif board[row][col] == 0:
            zero += 1
        elif board[row][col] == 1:
            plus += 1
    else:
        width = width // 3
        partition(row, col, width);
        partition(row, col + width, width);
        partition(row, col + 2 * width, width);

        partition(row + width, col, width);
        partition(row + width, col + width, width);
        partition(row + width, col + 2 * width, width);

        partition(row + 2 * width, col, width);
        partition(row + 2 * width, col + width, width);
        partition(row + 2 * width, col + 2 * width, width);


partition(0, 0, size)
print(minus, zero, plus, sep="\n")
