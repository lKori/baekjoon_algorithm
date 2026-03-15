package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_8710 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        while(k < w) {
            k += m;

            count++;
        }

        System.out.println(count);
    }
}
