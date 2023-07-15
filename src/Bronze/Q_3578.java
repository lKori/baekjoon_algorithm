package Bronze;

import java.io.*;

public class Q_3578 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if(h == 0) {
            System.out.println(1);
        } else if(h == 1) {
            System.out.println(0);
        } else {
            if(h % 2 != 0) {
                sb.append("4");
                h--;
                sb.append("8".repeat(h / 2));
            } else {
                sb.append("8".repeat(h / 2));
            }
        }

        System.out.println(sb.toString());
    }
}
