from collections import Counter
n = int(input())
number = []
for i in range(n):
    num = int(input())
    number.append(num)

number.sort()
counter = Counter(number).most_common

# 평균값
mean = round(sum(number) / n)
print(mean)

# 중앙값
median = number[n//2]
print(median)

# 최빈값
if len(counter) == 1:
    key1, value1 = counter[0]
    print(key1)
else:
    key1, value1 = counter[0]
    key2, value2 = counter[1]
    if value1 == value2:
        print(key2)
    else:
        print(key1)

# 범위
print(number[-1]-number[0])