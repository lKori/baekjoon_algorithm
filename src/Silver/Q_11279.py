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
                print(-heappop(heap))
            else:
                print(0)
        else:
            heappush(heap, -x)

if __name__ == "__main__":
    main()

# 힙 직접 구현하기

# def solve():
#     N = int(input().rstrip())
#
#     heap = [0]      # 편의를 위해 인덱스 0은 사용하지 않음
#
#     for _ in range(N):
#         x = int(input().rstrip())
#
#         heap_size = len(heap)
#
#         if x == 0:  # x: 0 이면 최대값 출력 후 배열에서 삭제
#             if heap_size == 1:
#                 print(0)
#             elif heap_size == 2:
#                 print(heap.pop())
#             else:
#                 print(heap[1])
#
#                 # 마지막 노드를 루트 노드로 이동
#                 target = heap.pop()
#                 heap_size -= 1
#
#                 # 자식 노드가 있을 경우 더 큰 값의 자식 노드와 비교하여 자리 정렬
#                 idx = 1
#
#                 while 1:
#                     left_idx = idx * 2 if (idx * 2) <= (heap_size - 1) else -1
#
#                     # 자식 노드 없음
#                     if left_idx == -1:
#                         break
#
#                     # 자식 노드 중 큰 값과 비교하여 자리 바꾸기
#                     if left_idx + 1 > heap_size - 1 or heap[left_idx] >= heap[left_idx + 1]:
#                         if target < heap[left_idx]:
#                             heap[idx] = heap[left_idx]
#                             idx = left_idx
#                         else:
#                             break
#                     else:
#                         if target < heap[left_idx + 1]:
#                             heap[idx] = heap[left_idx + 1]
#                             idx = left_idx + 1
#                         else:
#                             break
#
#                 heap[idx] = target
#         else:       # x를 힙에 추가
#             heap.append(x)
#             heap_size += 1
#
#             # 부모 노드와 비교하여 올바른 자리로 이동
#             # 부모 노드: idx // 2
#             if heap_size > 2:
#                 idx = heap_size - 1
#
#                 while idx > 1:
#                     parent_idx = idx // 2
#
#                     if x > heap[parent_idx]:
#                         heap[idx] = heap[parent_idx]
#                         idx = parent_idx
#                     else:
#                         break
#
#                 heap[idx] = x
#
# if __name__ == "__main__":
#     solve()