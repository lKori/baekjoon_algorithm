package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1267 {
    public static int yPrice(int call) {
        int full = (call + 1) / 30;
        int over = (call + 1) % 30;

        if(over == 0) {
            return 10  * full;
        } else {
            return 10 * (full + 1);
        }
    }

    public static int mPrice(int call) {
        int full = (call + 1) / 60;
        int over = (call + 1) % 60;

        if(over == 0) {
            return 15  * full;
        } else {
            return 15 * (full + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int yTotal = 0;
        int mTotal = 0;

        for(int i = 0; i < n; i++) {
            int call = Integer.parseInt(st.nextToken());

            yTotal += yPrice(call);
            mTotal += mPrice(call);
        }

        if(yTotal > mTotal) {
            System.out.print("M " + mTotal);
        } else if(yTotal < mTotal) {
            System.out.print("Y " + yTotal);
        } else {
            System.out.println("Y M " + yTotal);
        }
    }
}
