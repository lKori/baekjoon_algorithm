package sovedoc_arena.grand_arena_2;

import java.io.*;

public class Q_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for(int i = 1; i <= n; i++) {
            total1 += i;
            total3 += i * i * i;
        }

        total2 = total1 * total1;

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
    }
}
