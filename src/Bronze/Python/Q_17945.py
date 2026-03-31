import sys

input = sys.stdin.readline

def main():
    A, B = map(int, input().rstrip().split())

    D = A ** 2 - B

    if D == 0:
        print(-A)
    else:
        ans_1 = (-A + D ** 0.5)
        ans_2 = (-A - D ** 0.5)
        print(int(min(ans_1, ans_2)))
        print(int(max(ans_1, ans_2)))

if __name__ == "__main__":
    main()