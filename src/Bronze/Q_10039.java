package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        for(int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());

            if(score < 40) {
                total += 40;
            } else {
                total += score;
            }
        }

        System.out.print(total / 5);
    }
}
