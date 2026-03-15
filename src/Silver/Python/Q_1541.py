import sys
input = sys.stdin.readline

e = input().rstrip()

es = [sum(map(int, nums.split("+"))) for nums in e.split("-")]

ans = es[0]

for num in es[1:]:
    ans -= int(num)

print(ans)