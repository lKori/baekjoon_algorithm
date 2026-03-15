import sys

input = sys.stdin.readline

dp = None

def search(px, py, row_len, col_len):
    stack = []
    stack.append([px, py])

    while stack:
        x, y = stack.pop()

        if x + 1 < row_len and dp[x + 1][y] == 1:
            stack.append([x + 1, y])
            dp[x + 1][y] = 0

        if x - 1 >= 0 and dp[x - 1][y] == 1:
            stack.append([x - 1, y])
            dp[x - 1][y] = 0

        if y + 1 < col_len and dp[x][y + 1] == 1:
            stack.append([x, y + 1])
            dp[x][y + 1] = 0

        if y - 1 >= 0 and dp[x][y - 1] == 1:
            stack.append([x, y - 1])
            dp[x][y - 1] = 0

if __name__ == "__main__":
    T = int(input().rstrip())

    for _ in range(T):
        # M: 가로길이, N: 세로길이, K: 배추 개수
        M, N, K = map(int, input().rstrip().split())

        dp = [[0 for _ in range(N)] for _ in range(M)]
        points = []
        ans = 0

        for _ in range(K):
            x, y = map(int, input().rstrip().split())
            dp[x][y] = 1
            points.append([x, y])

        for px, py in points:
            if dp[px][py] != 0:
                ans += 1
                dp[px][py] = 0
                search(px, py, M, N)

        print(ans)