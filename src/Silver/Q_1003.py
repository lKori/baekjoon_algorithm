import sys

zero = 0
one = 0

d1 = {
    0: 0,
    1: 1,
}

d2 = {
    0: [1, 0],
    1: [0, 1],
    2: [1, 1]
}

def fibo(n):
    global zero
    global one

    if n == 0:
        zero += 1
        return d1[0]
    elif n == 1:
        one += 1
        return d1[1]

    if n in d1:
        zero += d2[n][0]
        one += d2[n][1]
        return d1[n]

    res = fibo(n - 1) + fibo(n - 2)

    if n not in d1:
        d1[n] = res

    if n not in d2:
        d2[n] = [zero, one]

    return res

if __name__ == "__main__":
    T = int(sys.stdin.readline().rstrip())

    for i in range(T):
        zero = 0
        one = 0

        N = int(sys.stdin.readline().rstrip())

        fibo(N)

        d2[N] = [zero, one]

        print(zero, one)