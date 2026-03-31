import sys

input = sys.stdin.readline

def main():
    A, B, C = map(int, input().rstrip().split())

    parking_time = [0] * 101
    last_time = 0
    price = 0

    for _ in range(3):
        s, e = map(int, input().rstrip().split())

        if e > last_time:
            last_time = e

        for t in range(s, e):
            parking_time[t] += 1

    parking_time[last_time] = -1

    for t in parking_time:
        if t == -1:
            break

        if t == 1:
            price += A
        elif t == 2:
            price += B * 2
        elif t == 3:
            price += C * 3

    print(price)

if __name__ == "__main__":
    main()