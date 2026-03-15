package Bronze;

import java.io.*;

public class Q_5524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            s = s.toLowerCase();

            bw.write(s + "\n");
        }

        bw.close();
    }
}
