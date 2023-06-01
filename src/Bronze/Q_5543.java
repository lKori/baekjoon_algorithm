package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int hambuger = Integer.MAX_VALUE;
        int drink = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++) {
            int h = Integer.parseInt(br.readLine());

            if(h < hambuger) {
                hambuger = h;
            }
        }

        for(int j = 0; j < 2; j++) {
            int d = Integer.parseInt(br.readLine());

            if(d < drink) {
                drink = d;
            }
        }

        System.out.print(hambuger + drink - 50);
    }
}
