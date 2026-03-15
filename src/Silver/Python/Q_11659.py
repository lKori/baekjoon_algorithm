import sys

input = sys.stdin.readline

def main():
    N, M = map(int, input().rstrip().split())

    dp = [0]

    for num in map(int, input().rstrip().split()):
        # 배열에 추가하면서 누적합으로 저장
        dp.append(dp[-1] + num)

    for _ in range(M):
        i, j = map(int, input().rstrip().split())

        print(dp[j] - dp[i - 1])

if __name__ == "__main__":
    main()