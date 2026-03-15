package Bronze;

import java.io.*;

public class Q_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 0;
        int c = 0;

        a = time / 300;
        time %= 300;

        b = time / 60;
        time %= 60;

        c = time / 10;
        time %= 10;

        if(time != 0) {
            System.out.print(-1);
        } else {
            System.out.printf("%d %d %d", a, b, c);
        }
    }
}
