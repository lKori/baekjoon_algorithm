package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] sticks = new int[n];

        for(int i = 0; i < n; i++) {
            sticks[i] = Integer.parseInt(br.readLine());
        }

        int total = 1;
        int higher = sticks[sticks.length - 1];

        for(int j = sticks.length - 2; j >= 0; j--) {
            if(sticks[j] > higher) {
                total++;
                higher = sticks[j];
            }
        }

        System.out.println(total);
    }
}
