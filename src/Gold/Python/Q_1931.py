import sys

input = sys.stdin.readline

def main():
    N = int(input().rstrip())

    meetings = []

    for _ in range(N):
        s, e = map(int, input().rstrip().split())
        meetings.append((e, s))

    meetings.sort()

    prev_end = meetings[0][0]
    count = 1

    for e, s in meetings[1:]:
        if s >= prev_end:
            count += 1
            prev_end = e

    print(count)

if __name__ == "__main__":
    main()