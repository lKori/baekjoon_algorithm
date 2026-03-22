import sys

input = sys.stdin.readline

def main():
    graph = None
    visited = set()

    def dfs(node):
        nodes = [node]
        visited.add(node)

        while nodes:
            n = nodes.pop()

            for i in graph[n]:
                if i not in visited:
                    nodes.append(i)
                    visited.add(i)

    N, M = map(int, input().rstrip().split())

    graph = [[] for _ in range(N + 1)]

    for _ in range(M):
        u, v = map(int, input().split())

        # 방향이 없는 그래프이므로 두 정점에 모두 추가
        graph[u].append(v)
        graph[v].append(u)

    connect_component = 0

    for i in range(1, N + 1):
        if i not in visited:
            connect_component += 1
            dfs(i)

    print(connect_component)

if __name__ == "__main__":
    main()