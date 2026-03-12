import sys

M = int(sys.stdin.readline())

s1 = set()

for j in range(M):
    s = str(sys.stdin.readline())

    operation = s.split()[0]

    if operation == 'all':
        s1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
        continue
    elif operation == 'empty':
        s1.clear()
        continue

    num = int(s.split()[1])

    if operation == 'add':
        s1.add(num)
    elif operation == 'remove':
        s1.discard(num)
    elif operation == 'check':
        if num in s1:
            print(1)
        else:
            print(0)
    elif operation == 'toggle':
        if num in s1:
            s1.discard(num)
        else:
            s1.add(num)