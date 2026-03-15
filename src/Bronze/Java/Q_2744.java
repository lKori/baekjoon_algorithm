package Bronze;

import java.io.*;

public class Q_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(Character c : s.toCharArray()) {
            if(Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
        }

        System.out.print(sb.toString());
    }
}
