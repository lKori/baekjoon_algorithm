import sys

isbn = list(sys.stdin.readline().strip())
m = int(isbn.pop(-1))

sum = 0

idx = 0
for i in isbn:
    if(i == '*'):
        idx += 1
        continue

    if(idx % 2 == 0):
        sum += int(i)
    else:
        sum += 3 * int(i)

    idx += 1

answer = -1;
index_even = isbn.index('*') % 2 == 1

for i in range(10):
    if index_even:
        if (sum + m + (3 * i)) % 10 == 0:
            answer = i
            break
    else:
        if (sum + m + i) % 10 == 0:
            answer = i
            break

print(answer)