package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_13777 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) {
                break;
            }

            int start = 1;
            int end = 50;

            while(start <= end) {
                int mid = (start + end) / 2;

                if(n == mid) {
                    bw.write(String.valueOf(mid));
                    break;
                }

                if(mid > n) {
                    end = mid - 1;

                    bw.write(mid + " ");
                } else if(mid < n) {
                    start = mid + 1;

                    bw.write(mid + " ");
                }


            }

            bw.write("\n");
        }

        bw.close();
    }
}
