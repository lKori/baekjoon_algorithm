package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());

            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());

            int resultH = h2 - h1;
            int resultM = 0;
            int resultS = 0;

            if(s2 < s1) {
                resultS = s2 - s1 + 60;

                m1++;
            } else {
                resultS = s2 - s1;
            }

            if(m2 < m1) {
                resultM = m2 - m1 + 60;

                resultH--;
            } else {
                resultM = m2 - m1;
            }

            bw.write(resultH + " " + resultM + " " + resultS + "\n");
        }

        bw.close();
    }
}
