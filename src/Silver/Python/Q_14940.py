import sys
from collections import deque

input = sys.stdin.readline

def main():
    n, m = map(int, input().rstrip().split())

    maps = []
    ans = [[-1 for _ in range(m)] for _ in range(n)]
    queue = deque()

    for _ in range(n):
        maps.append(list(map(int, input().rstrip().split())))

    for y in range(n):
        for x in range(m):
            if maps[y][x] == 0:
                ans[y][x] = 0

            if maps[y][x] == 2:
                queue.append((x, y))
                ans[y][x] = 0

    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < m and 0 <= ny < n and ans[ny][nx] == -1:
                queue.append((nx, ny))
                ans[ny][nx] = ans[y][x] + 1

    for row in ans:
        print(*row)

if __name__ == "__main__":
    main()