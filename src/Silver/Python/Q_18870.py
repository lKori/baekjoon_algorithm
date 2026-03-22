import sys

input = sys.stdin.readline

def main():
    N = int(input().rstrip())

    # 숫자 입력
    numbers = list(map(int, input().rstrip().split()))
    # 정렬용 배열
    sort_list = set(numbers)
    number_hash = {}

    sort_list = sorted(sort_list)

    for idx, number in enumerate(sort_list):
        number_hash[number] = idx

    print(" ".join(str(number_hash[number]) for number in numbers))
    # ans = []
    # for number in numbers:
    #     ans.append(number_hash[number])
    #
    # print(*ans)

if __name__ == "__main__":
    main()