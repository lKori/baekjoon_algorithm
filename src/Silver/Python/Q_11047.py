import sys

N, K = map(int, sys.stdin.readline().rstrip().split())
res = 0

a1 = []

for i in range(N):
    a1.insert(0, int(sys.stdin.readline().rstrip()))

for j in a1:
    if j <= K:
        res += K // j
        K = K % j

print(res)