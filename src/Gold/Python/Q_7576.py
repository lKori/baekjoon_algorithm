import sys
from collections import deque

input = sys.stdin.readline

def main():
    M, N = map(int, input().rstrip().split())

    box = []
    queue = deque()
    unripe_count = 0

    for _ in range(N):
        box.append(list(map(int, input().rstrip().split())))

    for y, row in enumerate(box):
        for x, val in enumerate(row):
            if val == 1:
                queue.append((x, y))

            if val == 0:
                unripe_count += 1

    day = 1

    while queue:
        x, y = queue.popleft()

        day = box[y][x]

        for dx, dy in ((1, 0), (-1, 0), (0, 1), (0, -1)):
            nx = x + dx
            ny = y + dy

            if 0 <= nx < M and 0 <= ny < N and box[ny][nx]== 0:
                box[ny][nx] = box[y][x] + 1
                queue.append((nx, ny))
                unripe_count -= 1

    if unripe_count != 0:
        day = 0

    print(day - 1)

if __name__ == "__main__":
    main()