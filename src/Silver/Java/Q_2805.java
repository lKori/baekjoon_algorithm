package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2805 {
    public static long check(long mid, long[] trees) {
        long total = 0;

        for(int i = 0; i < trees.length; i++) {
            // 만약 해당 높이에서 잘랐을 경우 음수가 나오면 나무가 안잘린다는 의미
            if(trees[i] - mid >= 0) {
                total += trees[i] - mid;
            }
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        long[] trees = new long[n];

        st = new StringTokenizer(br.readLine());

        long start = 0;
        long end = Integer.MIN_VALUE;

        for(int i = 0; i < trees.length; i++) {
            int tree = Integer.parseInt(st.nextToken());

            // 가장 길이가 긴 나무 높이부터 탐색하기 위함
            if(tree > end) {
                end = tree;
            }
            trees[i] = tree;
        }

        while(start <= end) {
            long mid = (start + end) / 2;

            if(check(mid, trees) >= m) {
                // 해당 높이에서 총 합이 목표값보다 높다면 더 높은 범위에 해가 존재
                start = mid + 1;
            } else {
                // 해당 높이에서 총 합이 목표값보다 낮다면 더 낮은 범위에 해가 존재
                end = mid - 1;
            }
        }

        System.out.print(end);
    }
}
