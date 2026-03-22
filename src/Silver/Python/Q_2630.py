import sys

input = sys.stdin.readline
papers = []
white_count = 0
blue_count = 0

def paper_check(x, y, paper_length):
    global white_count
    global blue_count

    first_color = papers[y][x]
    same_color = True
    paper_half = paper_length // 2

    for i in range(paper_length):
        if not same_color:
            break

        for j in range(paper_length):
            if papers[y + i][x + j] != first_color:
                same_color = False
                break

    if same_color:
        if first_color == 0:
            white_count += 1
        else:
            blue_count += 1
    else:
        # 만약 색상이 다르다면 색종이 자르기
        paper_check(x, y, paper_half)
        paper_check(x + paper_half, y, paper_half)
        paper_check(x, y + paper_half, paper_half)
        paper_check(x + paper_half, y + paper_half, paper_half)

def main():
    N = int(input().rstrip())

    for _ in range(N):
        papers.append(list(map(int, input().rstrip().split())))

    paper_check(0, 0, N)

    print(white_count)
    print(blue_count)

if __name__ == "__main__":
    main()