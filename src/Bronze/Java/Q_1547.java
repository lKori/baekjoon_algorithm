package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int ball = 1;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            if(c1 == ball) {
                ball = c2;
            } else if(c2 == ball) {
                ball = c1;
            }
        }

        System.out.print(ball);
    }
}
