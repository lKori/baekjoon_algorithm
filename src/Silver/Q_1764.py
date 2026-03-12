import sys

N, M = map(int, sys.stdin.readline().split())

s1 = set()
res = dict()

for i in range(N):
    s1.add(sys.stdin.readline().rstrip())

for j in range(M):
    h = sys.stdin.readline().rstrip()

    if h in s1:
        res[h] = 1

print(len(res))

res = sorted(res, reverse=False)

for k in res:
    print(k)