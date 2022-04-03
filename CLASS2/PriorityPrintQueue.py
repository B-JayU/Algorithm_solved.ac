# -*- encoding : utf-8 -*-
import sys
from collections import deque

inputL = sys.stdin.readline

n_try = int(inputL())


for tries in range(n_try):
	n,m = map(int, input().split())
 
	printQ = deque(list(map(int, input().split(' '))))
	count = 0
 
	while printQ:
		max_priority = max(printQ)
		front = printQ.popleft()
		m -= 1

		if max_priority == front:
			count = count + 1
			if m < 0:
				print(count)
				break;

		else:
			printQ.append(front)
			if m < 0:
				m = len(printQ)-1

  
	
 
	
	
 