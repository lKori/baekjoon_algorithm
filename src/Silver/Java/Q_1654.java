package Silver;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] cables = new int[k];
        long start = 0;
        long end = Integer.MAX_VALUE;


        for(int i = 0; i < k; i++) {
            cables[i] = Integer.parseInt(br.readLine());
        }

        while(start <= end) {
            long mid = (start + end) / 2;

            if(check(mid, cables) >= n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        bw.write(String.valueOf(end));

        bw.close();
    }

    public static int check(long mid, int[] cables) {
        int total = 0;

        for(int i = 0; i < cables.length; i++) {
            total += cables[i] / mid;
        }

        return total;
    }
}
