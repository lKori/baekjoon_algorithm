package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int aClear = 0;
        int bClear = 0;

        if(a % c != 0) {
            aClear = (a / c) + 1;
        } else {
            aClear = a / c;
        }

        if(b % d != 0) {
            bClear = (b / d) + 1;
        } else {
            bClear = b / d;
        }

        System.out.print(aClear > bClear ? l - aClear : l - bClear);
    }
}
