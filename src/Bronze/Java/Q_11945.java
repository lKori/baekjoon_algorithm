package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer(br.readLine());

            bw.write(sb.reverse() + "\n");
        }

        bw.close();
    }
}
