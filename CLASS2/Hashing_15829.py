# -*- encoding : utf-8 -*-
import sys

input= sys.stdin.readline
length = int(input())

str1 = input()
str1.rstrip()

r = 31; M=1234567891
letters = [l for l in str1]

summation = 0
for i in range(0,length):
	summation += ((ord(letters[i]) - ord("a") + 1) * r**i)
print(summation % M)
