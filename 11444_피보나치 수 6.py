N = int(input())
matrix = [[1, 1], [1, 0]]


def mul_matrix(mat1, mat2):
    res = [[0, 0], [0, 0]]
    for i in range(2):
        for j in range(2):
            for z in range(2):
                res[i][j] += mat1[i][z] * mat2[z][j] % 1000000007
    return res


def power(a, b):
    if b == 1:
        return a
    else:
        tmp = power(a, b // 2)
        tmp2 = mul_matrix(tmp, tmp)
        if b % 2 == 0:
            return tmp2
        else:
            return mul_matrix(tmp2, a)


result = power(matrix, N)
print(result[0][1] % 1000000007)
