import sys

a, b = map(int, sys.stdin.readline().rstrip().split())

ans = 1

for i in range(a, b + 1):
    ans *= ((i ** 2 + i) // 2) % 14579

print(ans % 14579)