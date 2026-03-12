import sys

N = int(sys.stdin.readline().rstrip())

d1 = {
    1: 0,
    2: 1,
    3: 1
}

for i in range(4, N + 1):
    d1[i] = d1[i - 1] + 1

    if i % 3 == 0:
        d1[i] = min(d1[i // 3] + 1, d1[i])

    if i % 2 == 0:
        d1[i] = min(d1[i // 2] + 1, d1[i])

print(d1[N])