import sys
from collections import deque

input = sys.stdin.readline

def main():
    N, M = map(int, input().split())

    maze = []
    queue = deque()

    for _ in range(N):
        maze.append(list(map(int, input().rstrip())))

    queue.append((0, 0))
    maze[0][0] = 2

    dxdy = ((-1, 0), (1, 0), (0, -1), (0, 1))

    while queue:
        x, y = queue.popleft()

        for dx, dy in dxdy:
            nx = x + dx
            ny = y + dy

            if 0 <= nx < M and 0 <= ny < N and maze[ny][nx] == 1:
                queue.append((nx, ny))
                maze[ny][nx] = maze[y][x] + 1

                if nx == M - 1 and ny == N - 1:
                    queue.clear()

    print(maze[N - 1][M - 1] - 1)

if __name__ == "__main__":
    main()