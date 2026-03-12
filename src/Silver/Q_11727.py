import sys

N = int(sys.stdin.readline().rstrip())

d = [0, 1, 3]

for i in range(len(d), N + 1):
    d.append((d[i - 1] + (d[i - 2] * 2)) % 10007)

print(d[N])