package Silver;

import java.io.*;
import java.util.StringTokenizer;

public class Q_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int j = 0; j < arr.length; j++) {
            int rank = 1;

            for(int k = 0; k < arr.length; k++) {
                if(j == k) {
                    continue;
                } else {
                    if(arr[j][0] < arr[k][0] && arr[j][1] < arr[k][1]) {
                        rank++;
                    }
                }
            }

            sb.append(rank).append(" ");
        }

        System.out.print(sb);
    }
}
