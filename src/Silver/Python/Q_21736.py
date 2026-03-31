import sys
from collections import deque

input = sys.stdin.readline

def main():
    N, M = map(int, input().rstrip().split())

    campus = []
    queue = deque()
    count = 0

    for i in range(N):
        campus.append(list(input().rstrip()))

    for y, row in enumerate(campus):
        if queue:
            break

        for x, val in enumerate(row):
            if val == "I":
                queue.append((x, y))
                campus[y][x] = "X"
                break

    while queue:
        x, y = queue.popleft()

        for dx, dy in ((1, 0), (-1, 0), (0, 1), (0, -1)):
            nx = x + dx
            ny = y + dy

            if 0 <= nx < M and 0 <= ny < N and campus[ny][nx] != "X":
                if campus[ny][nx] == "P":
                    count += 1

                queue.append((nx, ny))
                campus[ny][nx] = "X"

    if count == 0:
        print("TT")
    else:
        print(count)

if __name__ == "__main__":
    main()