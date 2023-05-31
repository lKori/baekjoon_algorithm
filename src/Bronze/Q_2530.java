package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());

        s += time;

        if(s >= 60) {
            m += s / 60;
            s = s % 60;
        }

        if(m >= 60) {
            h += m / 60;
            m = m % 60;
        }

        if(h > 23) {
            while(h > 23) {
                h -= 24;
            }
        }

        System.out.print(h + " " + m + " " + s);
    }
}
