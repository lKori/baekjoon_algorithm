package Bronze;

import java.io.*;

public class Q_5357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        char c;

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();

            c = s.charAt(0);
            sb.append(c);

            for(int j = 1; j < s.length(); j++) {
                if(c == s.charAt(j)) {
                    continue;
                } else {
                    c = s.charAt(j);
                    sb.append(c);
                }
            }

            bw.write(sb.toString() + "\n");
        }

        bw.close();
    }
}
