package Bronze;

import java.io.*;

public class Q_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";

        while(!(s = br.readLine()).equals("0")) {
            StringBuffer sb = new StringBuffer(s);
            String reverseStr = sb.reverse().toString();

            if(s.equals(reverseStr)) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.close();
    }
}
