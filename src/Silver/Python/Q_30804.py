import sys

input = sys.stdin.readline

def main():
    N = int(input().rstrip())

    fruits = list(map(int, input().rstrip().split()))
    fruit_kind = 0
    fruit_count = [0] * 10
    left_pointer = 0
    max_count = 0

    for right_pointer in range(N):
        right_fruit = fruits[right_pointer]

        if fruit_count[right_fruit] == 0:
            fruit_kind += 1

        fruit_count[right_fruit] += 1

        while fruit_kind > 2:
            left_fruit = fruits[left_pointer]
            fruit_count[left_fruit] -= 1

            if fruit_count[left_fruit] == 0:
                fruit_kind -= 1

            left_pointer += 1

        max_count = max(max_count, right_pointer - left_pointer + 1)

    print(max_count)

if __name__ == "__main__":
    main()