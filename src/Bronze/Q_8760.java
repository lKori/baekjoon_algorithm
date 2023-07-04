package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_8760 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int area = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());

            System.out.println(area / 2);
        }
    }
}
