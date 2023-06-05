package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1;
        StringTokenizer st2;

        int score1 = 0;
        int score2 = 0;

        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++) {
            score1 += Integer.parseInt(st1.nextToken());
            score2 += Integer.parseInt(st2.nextToken());
        }

        System.out.print(score1 > score2 ? score1 : score2);
    }
}
