package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_8558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int fac = 1;

        for(int i = 1; i <= n; i++) {
            fac *= i;

            fac %= 10;
        }

        System.out.print(fac);
    }
}
