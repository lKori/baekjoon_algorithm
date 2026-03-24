import sys

input = sys.stdin.readline

# 비트 연산자를 이용한 풀이
N, r, c = map(int, input().rstrip().split())

res = 0

for i in range(N):
    res += ((c >> i) & 1) << (2 * i)
    res += ((r >> i) & 1) << (2 * i + 1)

print(res)

# def check_order(n, x, y):
#     length = 2 ** n
#     pos_x = x
#     pos_y = y
#     res = 0
#
#     while length > 1:
#         half = length // 2
#         quarter = half * half
#
#         # 1사분면
#         if pos_x >= half and pos_y < half:
#             # 2사분면 갯수 더하기
#             res += quarter
#
#         # 3사분면
#         if pos_x < half and pos_y >= half:
#             # 1, 2사분면 갯수 더하기
#             res += quarter * 2
#
#         # 4사분면
#         if pos_x >= half and pos_y >= half:
#             # 1, 2, 3사분면 갯수 더하기
#             res += quarter * 3
#
#         pos_x = pos_x - half if pos_x >= half else pos_x
#         pos_y = pos_y - half if pos_y >= half else pos_y
#
#         length = length // 2
#
#     return res
#
# def main():
#
#     N, r, c = map(int, input().rstrip().split())
#
#     print(check_order(N, c, r))

# if __name__ == "__main__":
#     main()