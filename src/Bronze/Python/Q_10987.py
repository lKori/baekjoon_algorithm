import sys

input = sys.stdin.readline

vowels = {'a', 'e', 'i', 'o', 'u'}
count = 0

for s in input().rstrip():
    if s in vowels:
        count += 1

print(count)