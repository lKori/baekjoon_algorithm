package sovedoc_arena.grand_arena_2;

import java.io.*;
import java.util.StringTokenizer;

public class Q_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;

        for(int i = 0; i < 3; i++) {
            String s = br.readLine();

            if((int) s.charAt(0) > 48 && (int) s.charAt(0) < 58) {
                num = Integer.parseInt(s);
            }

            num++;
        }

        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if(num % 3 == 0) {
            System.out.println("Fizz");
        } else if(num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
