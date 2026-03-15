package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        int countA1 = 0;

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == 'a') {
                countA1++;
            }
        }

        String s2 = br.readLine();
        int countA2 = 0;

        for(int j = 0; j < s2.length(); j++) {
            if(s2.charAt(j) == 'a') {
                countA2++;
            }
        }

        System.out.print(countA1 >= countA2 ? "go" : "no");
    }
}
