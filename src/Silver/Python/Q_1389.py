import sys
from collections import deque

input = sys.stdin.readline

def main():
    N, M = map(int, input().rstrip().split())

    nodes = [[] for _ in range(N + 1)]
    queue = deque()

    for _ in range(M):
        s, e = map(int, input().rstrip().split())

        nodes[s].append(e)
        nodes[e].append(s)

    sum_list = []

    for i in range(1, N + 1):
        queue.append(i)
        visited = {i: 0}

        while queue:
            node = queue.popleft()

            for link in nodes[node]:
                if link not in visited:
                    visited[link] = visited[node] + 1
                    queue.append(link)

        sum_list.append(sum(visited.values()))

    print(sum_list.index(min(sum_list)) + 1)

if __name__ == "__main__":
    main()