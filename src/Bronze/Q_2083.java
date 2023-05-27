package Bronze;

import java.io.*;

public class Q_2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String s = br.readLine();
            String group = "";

            if(s.equals("# 0 0")) {
                break;
            }

            String[] str = s.split(" ");

            if(Integer.parseInt(str[1]) > 17 || Integer.parseInt(str[2]) >= 80) {
                group = "Senior";
            } else {
                group = "Junior";
            }

            bw.write(str[0] + " " + group + "\n");
        }

        bw.close();
    }
}
