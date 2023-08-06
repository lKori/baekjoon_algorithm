package sovedoc_arena.grand_arena_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] pair = new int[10];

        for(int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());

            pair[n] += 1;
        }

        for(int j = 0; j < pair.length; j++) {
            if(pair[j] % 2 != 0) {
                System.out.println(j);

                break;
            }
        }
    }
}
