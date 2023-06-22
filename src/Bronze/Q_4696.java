package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_4696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true) {
            double n = Double.parseDouble(br.readLine());

            if(n == 0) {
                break;
            }

            double total = 1 + n + (n * n) + (n * n * n) + (n * n * n * n);
            System.out.printf("%.2f\n", total);
        }
    }
}
