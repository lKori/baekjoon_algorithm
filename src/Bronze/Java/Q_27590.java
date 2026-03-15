package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_27590 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int ds = Integer.parseInt(st.nextToken());
        int ys = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int dm = Integer.parseInt(st.nextToken());
        int ym = Integer.parseInt(st.nextToken());

        boolean sun = false;
        boolean moon = false;
        int year = 0;

        while(sun == false || moon == false) {
            if(ds % ys == 0) {
                sun = true;
            } else {
                sun = false;
            }

            if(dm % ym == 0) {
                moon = true;
            } else {
                moon = false;
            }

            ds++;
            dm++;
            year++;
        }

        System.out.println(year - 1);
    }
}
