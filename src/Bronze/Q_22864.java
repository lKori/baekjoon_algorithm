package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_22864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int time = 0;
        int tired = 0;
        int work = 0;

        while(time < 24) {
            if(tired + a <= m) {
                time++;
                tired += a;
                work += b;
            } else {
                time++;
                tired -= c;

                if(tired < 0) {
                    tired = 0;
                }
            }
        }

        System.out.print(work);
    }
}
