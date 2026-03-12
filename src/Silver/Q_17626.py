import sys

N = int(sys.stdin.readline().rstrip())

dp = [0, 1, 2, 3]

for i in range(len(dp), N + 1):
    dp.append(4)

    for j in range(1, i + 1):
        if j ** 2 > i:
            break

        dp[i] = min(dp[i], dp[i - j ** 2] + 1)

print(dp[N])