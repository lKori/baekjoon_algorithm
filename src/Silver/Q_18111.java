package Silver;

import java.io.*;
import java.util.StringTokenizer;

public class Q_18111 {
    public static int mine(int[][] arr, int h, int b) {
        int lower = 0;
        int higher = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] < h) {
                    // 기준 높이보다 낮은 블럭 체크
                    lower += h - arr[i][j];
                } else if(arr[i][j] > h) {
                    // 기준 높이보다 높은 블럭 체크
                    higher += arr[i][j] - h;
                }
            }
        }

        // 소지 블럭 수 + 얻은 블럭 수 보다 쌓아야 할 블럭이 많을 경우 높은 수 리턴
        if(lower > higher + b) {
            return Integer.MAX_VALUE;
        } else {
            // 블럭을 쌓거나 제거하는 총 시간 리턴
            return lower + higher * 2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max = 0;
        int time = Integer.MAX_VALUE;
        int maxHeight = 0;

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            int[] innerArr = new int [m];

            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < m; j++) {
                int height = Integer.parseInt(st.nextToken());

                if(height > max) {
                    max = height;
                }

                innerArr[j] = height;
            }

            arr[i] = innerArr;
        }

        while(max > -1) {
            int mineTime = mine(arr, max, b);

            if(time > mineTime) {
                time = mineTime;
                maxHeight = max;
            }

            max--;
        }

        System.out.print(time + " " + maxHeight);
    }
}