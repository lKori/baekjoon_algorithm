package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1676 {
    public static int count(int num, int base) {
        int n = num;
        int count = 0;

        while(true) {
            if(n % base == 0) {
                count++;
                n /= base;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int two = 0;
        int five = 0;

        for(int i = n; i > 0; i--) {

            two += count(i, 2);
            five += count(i, 5);
        }

        System.out.println(two > five ? five : two);
    }
}
