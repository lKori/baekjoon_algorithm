import sys

def dfs(n):
    worm.add(n)

    for c in dp[n]:
        if c not in worm:
            dfs(c)

computer = int(sys.stdin.readline().rstrip())

dp = []

for i in range(computer + 1):
    dp.append([])

pair = int(sys.stdin.readline().rstrip())

for j in range(pair):
    s, e = map(int, sys.stdin.readline().rstrip().split())

    dp[s].append(e)
    dp[e].append(s)

worm = set()

dfs(1)

print(len(worm) - 1)