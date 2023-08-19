package Silver;

import java.io.*;

public class Q_14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int total = Integer.MAX_VALUE;
        int five = 0;

        while(true) {
            if(n < five * 5) {
                break;
            }

            int money = n;
            int t = 0;

            t = five;
            money -= (five * 5);

            t += money / 2;
            money %= 2;

            if(money == 0) {
                if(t < total) {
                    total = t;
                }
            }

            five++;
        }

        if(total == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(total);
        }
    }
}
