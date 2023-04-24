package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String num = "1";

        while(true) {
            int total = 0;
            int number = Integer.parseInt(num);

            total += number;

            for(int i = 0; i < num.length(); i++) {
                total += Integer.parseInt(String.valueOf(num.charAt(i)));
            }

            if(total == n) {
                System.out.print(num);

                return;
            } else if(n == Integer.parseInt(num)) {
                System.out.print("0");

                return;
            } else {
                num = String.valueOf(number + 1);
            }
        }
    }
}
