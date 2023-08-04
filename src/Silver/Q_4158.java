package Silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(n == 0 && m == 0) {
                break;
            }

            int total = 0;

            Map<String, String> map = new HashMap<>();

            for(int i = 0; i < n; i++) {
                String s = br.readLine();
                map.put(s, "1");
            }

            for(int j = 0; j < m; j++) {
                String s = br.readLine();

                if(map.containsKey(s)) {
                    total++;
                }
            }

            bw.write(total + "\n");
        }

        bw.close();
    }
}
