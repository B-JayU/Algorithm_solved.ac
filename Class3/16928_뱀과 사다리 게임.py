import sys
from collections import deque
"""
1. 사다리가 있는 칸으로 이동하기 
2. 최대 6칸 이동하기
3. 뱀이 없는 최대 칸만큼 이동하기
"""

ladder_in = []
ladder_out = []
snake_in = []
snake_out = []

n, m = list(map(int, sys.stdin.readline().split(" ")))
for _ in range(n):
    start, end = list(map(int, sys.stdin.readline().split(" ")))
    ladder_in.append(start)
    ladder_out.append(end)
# ladder.sort(key=lambda x : x[0])

for _ in range(m):
    start, end = list(map(int, sys.stdin.readline().split(" ")))
    snake_in.append(start)
    snake_out.append(end)
# snake.sort(key=lambda x : x[0])

route = deque([(1, 0)])
visited = [1]


def game():
    while True:
        cur, second = route.popleft()

        for move in range(1, 7):
            new_loc = cur + move

            if new_loc == 100:
                distance = second + 1
                return distance

            if new_loc <= 100 and new_loc not in visited:
                if new_loc in ladder_in:
                    idx = ladder_in.index(new_loc)
                    d = ladder_out[idx]
                    if d not in visited:
                        new_loc = d

                elif new_loc in snake_in:
                    idx = snake_in.index(new_loc)
                    d = snake_out[idx]
                    if d not in visited:
                        new_loc = d

                if new_loc not in visited:
                    visited.append(new_loc)
                    route.append((new_loc, second + 1))


dist = game()
print(dist)
