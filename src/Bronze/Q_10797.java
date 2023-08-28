package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int total = 0;

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            int car = Integer.parseInt(st.nextToken());

            if(car % 10 == n) {
                total++;
            }
        }

        System.out.println(total);
    }
}
