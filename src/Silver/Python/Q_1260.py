import sys
from collections import deque

g = [[]]
visited = set()
node = []

def dfs(n):
    visited.add(n)
    node.append(n)

    for m in g[n]:
        if m not in visited:
            dfs(m)

def bfs(n):
    queue = deque([n])
    visited.add(n)

    while queue:
        m = queue.popleft()
        node.append(m)

        for k in g[m]:
            if k not in visited:
                visited.add(k)
                queue.append(k)

    for m in g[n]:
        if m not in visited:
            visited.add(m)
            node.append(m)

    for k in g[n]:
        if k not in visited:
            bfs(k)


N, M, V = map(int, sys.stdin.readline().rstrip().split())

for _ in range(N):
    g.append([])

for _ in range(M):
    s, e = map(int, sys.stdin.readline().rstrip().split())

    g[s].append(e)
    g[e].append(s)

for arr in g:
    arr.sort()

dfs(V)
print(*node)

visited.clear()
node.clear()
bfs(V)
print(*node)