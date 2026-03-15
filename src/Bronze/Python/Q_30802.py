import sys

N = int(sys.stdin.readline())
size = list(map(int, sys.stdin.readline().split()))
T, P = map(int, sys.stdin.readline().split())

ans_1 = 0
ans_2 = f'{N // P} {N % P}'

for i in size:
    if i == 0:
        continue

    if i // T == 0:
        ans_1 += 1
    elif i % T != 0:
        ans_1 += (i // T) + 1
    else:
        ans_1 += (i // T)

print(ans_1)
print(ans_2)