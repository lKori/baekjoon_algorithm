import sys
from heapq import heappush, heappop

input = sys.stdin.readline

def main():
    N = int(input().rstrip())

    heap = []

    for _ in range(N):
        x = int(input().rstrip())

        if x == 0:
            if heap:
                print(heappop(heap))
            else:
                print(0)
        else:
            heappush(heap, x)

if __name__ == "__main__":
    main()