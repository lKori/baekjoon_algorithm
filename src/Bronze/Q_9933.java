package Bronze;

import java.io.*;

public class Q_9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] passwords = new String[n];
        int len = 0;
        String mid = "";

        for(int i = 0; i < n; i++) {
            passwords[i] = br.readLine();
        }

        for(int j = 0; j < passwords.length; j++) {
            StringBuffer sb = new StringBuffer(passwords[j]);

            sb = sb.reverse();

            for(String s : passwords) {
                if(sb.toString().equals(s)) {
                    len = s.length();
                    mid = String.valueOf(s.charAt(len / 2));

                    System.out.println(len + " " + mid);
                    return;
                }
            }
        }
    }
}
