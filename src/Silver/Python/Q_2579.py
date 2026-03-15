import sys

N = int(sys.stdin.readline().rstrip())

stair = [0]

for i in range(N):
    stair.append(int(sys.stdin.readline().rstrip()))

if N == 1:
    print(stair[1])
elif N == 2:
    print(stair[1] + stair[2])
elif N == 3:
    print(max(stair[1] + stair[3], stair[2] + stair[3]))
else:
    dp = {
        0: 0,
        1: stair[1],
        2: stair[1] + stair[2],
        3: max(stair[1] + stair[3], stair[2] + stair[3])
    }

    for j in range(4, N + 1):
        dp[j] = max(dp[j - 2] + stair[j], dp[j - 3] + stair[j - 1] + stair[j])

    print(dp[N])