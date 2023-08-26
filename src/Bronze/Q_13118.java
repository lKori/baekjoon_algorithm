package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_13118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] person = new int[4];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++) {
            person[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int hit = -1;

        for(int j = 0; j < 4; j++) {
            if(person[j] == x) {
                hit = j;
            }
        }

        if(hit != -1) {
            System.out.println(hit + 1);
        } else {
            System.out.println(0);
        }
    }
}
