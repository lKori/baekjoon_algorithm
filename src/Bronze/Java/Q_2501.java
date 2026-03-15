package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if(k == 1) {
            System.out.println(1);

            return;
        }

        int factor = 0;
        int idx = 1;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                if(idx == k) {
                    factor = i;

                    break;
                }

                idx++;
            }
        }

        if(idx == k) {
            System.out.println(factor);
        } else {
            System.out.println(0);
        }
    }
}
