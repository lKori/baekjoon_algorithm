package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_25494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int total = 0;

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for(int x = 1; x <= a; x++) {
                for(int y = 1; y <= b; y++) {
                    for(int z = 1; z <= c; z++) {
                        if(x % y == y % z && x % y == z % x) {
                            total++;
                        }
                    }
                }
            }

            bw.write(total + "\n");
        }

        bw.close();
    }
}
