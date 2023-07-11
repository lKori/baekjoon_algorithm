package Bronze;

import java.io.*;

public class Q_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String s = br.readLine();

            if(s.equals("END")) {
                break;
            }

            StringBuffer sb = new StringBuffer(s);

            bw.write(sb.reverse().toString() + "\n");
        }

        bw.close();
    }
}
