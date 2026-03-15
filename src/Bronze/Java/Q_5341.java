package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_5341 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) {
                break;
            }

            int total = 0;

            for(int i = n; i > 0; i--) {
                total += i;
            }

            bw.write(total + "\n");
        }

        bw.close();
    }
}
