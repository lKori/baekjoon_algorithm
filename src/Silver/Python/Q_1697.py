import sys
from collections import deque

input = sys.stdin.readline

def main():
    N, K = map(int, input().rstrip().split())

    queue = deque()
    visited = set()

    queue.append([N, 0])
    visited.add(N)

    while queue:
        position, seconds = queue.popleft()

        if position == K:
            print(seconds)
            break

        if position + 1 not in visited and 0 <= position + 1 <= 100000:
            queue.append([position + 1, seconds + 1])
            visited.add(position + 1)

        if position - 1 not in visited and 0 <= position - 1 <= 100000:
            queue.append([position - 1, seconds + 1])
            visited.add(position - 1)

        if position * 2 not in visited and 0 <= position * 2 <= 100000:
            queue.append([position * 2, seconds + 1])
            visited.add(position * 2)

if __name__ == "__main__":
    main()