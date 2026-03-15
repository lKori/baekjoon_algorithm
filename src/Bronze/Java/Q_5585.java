package Bronze;

import java.io.*;

public class Q_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = Integer.parseInt(br.readLine());

        int change = 1000 - price;
        int[] money = {500, 100, 50, 10, 5, 1};
        int total = 0;

        for(int i = 0; i < money.length; i++) {
            total += change / money[i];
            change %= money[i];
        }

        System.out.println(total);
    }
}
