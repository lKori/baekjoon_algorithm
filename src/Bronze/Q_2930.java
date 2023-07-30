package Bronze;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2930 {
    public static int game(char s, char f) {
        int score = 0;

        if(s == f) {
            score += 1;
        } else {
            if(s == 'S' && f == 'P') {
                score += 2;
            } else if(s == 'P' && f == 'R') {
                score += 2;
            } else if(s == 'R' && f == 'S') {
                score += 2;
            }
        }

        return score;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int r = Integer.parseInt(br.readLine());
        String sang = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] friends = new String[n];

        int score = 0;
        int maxScore = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            friends[i] = st.nextToken();
        }

        for(int j = 0; j < r; j++) {
            int[] max = new int[3];

            for(int k = 0; k < n; k++) {
                char s = sang.charAt(j);
                char f = friends[k].charAt(j);


                score += game(s, f);
                max[0] += game('R', f);
                max[1] += game('S', f);
                max[2] += game('P', f);
            }

            Arrays.sort(max);

            maxScore += max[2];
        }

        System.out.println(score);
        System.out.println(maxScore);
    }
}
