package Bronze;

import java.io.*;

public class Q_5358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";

        while((s = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'i') {
                    sb.append('e');
                } else if(s.charAt(i) == 'I') {
                    sb.append('E');
                } else if(s.charAt(i) == 'e') {
                    sb.append('i');
                } else if(s.charAt(i) == 'E') {
                    sb.append('I');
                } else {
                    sb.append(s.charAt(i));
                }
            }

            bw.write(sb.toString() + "\n");
        }

        bw.close();
    }
}
