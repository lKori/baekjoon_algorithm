package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_9772 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());

            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());

            if(x == 0 && y == 0) {
                bw.write("AXIS");
                break;
            }

            if(x > 0 && y > 0) {
                bw.write("Q1\n");
            } else if(x < 0 && y > 0) {
                bw.write("Q2\n");
            } else if(x < 0 && y < 0) {
                bw.write("Q3\n");
            } else if(x > 0 && y < 0) {
                bw.write("Q4\n");
            } else {
                bw.write("AXIS\n");
            }
        }

        bw.close();
    }
}
