package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_5300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            bw.write(i + " ");

            if(i % 6 == 0 || i == n) {
                bw.write("Go! ");
            }
        }

        bw.close();
    }
}
