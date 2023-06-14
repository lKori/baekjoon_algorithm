package Bronze;

import java.io.*;

public class Q_1284 {
    public static int fontWidth(char c) {
        switch(c) {
            case '1':
                return 2;
            case '0':
                return 4;
            default:
                return 3;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String s = br.readLine();
            int total = s.length() + 1;

            if(s.equals("0")) {
                break;
            }

            for(Character c : s.toCharArray()) {
                total += fontWidth(c);
            }

            bw.write(total + "\n");
        }

        bw.close();
    }
}
