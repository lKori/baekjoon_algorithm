import sys

N, M = map(int, sys.stdin.readline().rstrip().split())

d1 = dict()

for i in range(N):
    url, pw = map(str, sys.stdin.readline().rstrip().split())

    d1[url] = pw

for j in range(M):
    print(d1[sys.stdin.readline().rstrip()])