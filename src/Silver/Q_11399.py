import sys

N = int(sys.stdin.readline().rstrip())

a1 = list(map(int, sys.stdin.readline().rstrip().split()))
a1.sort()

res = 0

for i in range(N - 1, -1, -1):
    res += a1[i]

    for j in range(i - 1, -1, -1):
        res += a1[j]

print(res)