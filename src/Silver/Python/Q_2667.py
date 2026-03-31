import sys
from collections import deque

input = sys.stdin.readline

def main():
    N = int(input().rstrip())

    maps = []
    queue = deque()
    dxdy = ((1, 0), (-1, 0), (0, 1), (0, -1))

    for _ in range(N):
        maps.append(list(map(int, input().rstrip())))

    apart_complex = []

    for col in range(N):
        for row in range(N):
            if maps[col][row] == 1:
                queue.append((row, col))
                maps[col][row] = 0
                house_count = 1

                while queue:
                    x, y = queue.popleft()

                    for dx, dy in dxdy:
                        nx = x + dx
                        ny = y + dy

                        if 0 <= nx < N and 0 <= ny < N and maps[ny][nx] == 1:
                            queue.append((nx, ny))
                            house_count += 1
                            maps[ny][nx] = 0

                apart_complex.append(house_count)

    apart_complex.sort()
    print(len(apart_complex))
    print(*apart_complex, sep="\n")


if __name__ == "__main__":
    main()