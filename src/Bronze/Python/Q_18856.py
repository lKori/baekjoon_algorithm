import sys

N = int(sys.stdin.readline().rstrip())

arr = [1, 2]

for i in range(3, N):
    arr.append(i)

arr.append(997)

print(N)
print(*arr)