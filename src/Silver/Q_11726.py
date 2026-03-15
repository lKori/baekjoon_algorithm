import sys

input = sys.stdin.readline

def main():
    N = int(input().rstrip())

    dp = [0, 1, 2]

    for i in range(3, N + 1):
        dp.append((dp[i - 1] + dp[i - 2]) % 10007)

    print(dp[N] % 10007)

if __name__ == "__main__":
    main()