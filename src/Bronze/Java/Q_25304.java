package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int x = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            total += a * b;
        }

        System.out.println(x == total ? "Yes" : "No");
    }
}
