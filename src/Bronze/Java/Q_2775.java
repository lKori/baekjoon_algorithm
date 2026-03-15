package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[k][n];

            // 0층 주민 초기화
            for(int h = 1; h <= n; h++) {
                arr[0][h - 1] = h;
            }

            for(int l = 1; l < k; l++) {
                int p = 0;

                for(int m = 0; m < n; m++) {
                    // 아랫층 해당 호수 주민 수 더하기
                    p += arr[l - 1][m];

                    // 현재층 해당 호수 주민 입력
                    arr[l][m] = p;
                }

            }

            int result = 0;

            for(int y = k - 1; y < k; y++) {
                for(int x = 0; x < n; x++) {
                    result += arr[y][x];
                }
            }

            bw.write(result + "\n");
        }

        bw.close();
    }
}
