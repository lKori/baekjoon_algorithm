package Bronze;

import java.io.*;

public class Q_10480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num % 2 == 0) {
                System.out.printf("%d is even\n", num);
            } else {
                System.out.printf("%d is odd\n", num);
            }
        }
    }
}
