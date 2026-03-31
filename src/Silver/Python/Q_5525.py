import sys

input = sys.stdin.readline

def main():
    N = int(input().rstrip())
    M = int(input().rstrip())
    S = input().rstrip()

    count = 0
    oi_count = 0
    idx = 0

    while idx < M - 2:
        if S[idx] == "I":
            if S[idx + 1] == "O" and S[idx + 2] == "I":
                oi_count += 1
                idx += 2

                if oi_count == N:
                    oi_count -= 1
                    count += 1
                continue
            else:
                oi_count = 0

        idx += 1

    print(count)

if __name__ == "__main__":
    main()