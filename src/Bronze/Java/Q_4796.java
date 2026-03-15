package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int idx = 1;

        while(true) {
            st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            int total = 0;

            if(l == 0 && p == 0 && v == 0) {
                break;
            }

            total += (v / p) * l;

            if(v % p < l) {
                total += v % p;
            } else {
                total += l;
            }

            bw.write("Case " + idx + ": " + total + "\n");

            idx++;
        }

        bw.close();
    }
}
