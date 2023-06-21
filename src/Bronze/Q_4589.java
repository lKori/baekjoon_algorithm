package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_4589 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        bw.write("Gnomes:\n");

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int g1 = Integer.parseInt(st.nextToken());
            int g2 = Integer.parseInt(st.nextToken());
            int g3 = Integer.parseInt(st.nextToken());

            if(g1 < g2 && g2 < g3) {
                bw.write("Ordered\n");
            } else if(g1 > g2 && g2 > g3) {
                bw.write("Ordered\n");
            } else {
                bw.write("Unordered\n");
            }
        }

        bw.close();
    }
}
