package Bronze;

import java.io.*;

public class Q_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int money = Integer.parseInt(br.readLine());

            int q = 0;
            int d = 0;
            int ni = 0;
            int p = 0;

            q = money / 25;
            money %= 25;

            d = money / 10;
            money %= 10;

            ni = money / 5;
            money %= 5;

            p = money / 1;
            money %= 1;

            bw.write(q + " " + d + " " + ni + " " + p + "\n");
        }

        bw.close();
    }
}
