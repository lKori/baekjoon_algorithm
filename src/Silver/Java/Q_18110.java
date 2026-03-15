package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] scores = new int[n];

        for(int i = 0; i < n; i++) {
            int s = Integer.parseInt(br.readLine());

            scores[i] = s;
        }

        Arrays.sort(scores);

        long excep = Math.round((double) scores.length * 0.15);

        long avg  = 0;

        for(long j = excep; j < scores.length - excep; j++) {
            avg += scores[(int) j];
        }

        avg = Math.round((double) avg / (scores.length - (2 * excep)));

        System.out.println(avg);
    }
}
