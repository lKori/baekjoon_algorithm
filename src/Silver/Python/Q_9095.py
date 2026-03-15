import sys

input = sys.stdin.readline

def main():
    T = int(input().rstrip())

    dp = [0, 1, 2, 4]

    for _ in range(T):
        N = int(input().rstrip())

        for i in range(len(dp), N + 1):
            dp.append(dp[i - 1] + dp[i - 2] + dp[i - 3])

        print(dp[N])

if __name__ == "__main__":
    main()