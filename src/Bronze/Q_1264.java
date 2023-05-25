package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        ArrayList<Character> arr = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        while(true) {
            int n = 0;

            String s = br.readLine();

            if(s.equals("#")) {
                break;
            }

            for(Character c : s.toCharArray()) {
                if(arr.contains(c)) {
                    n++;
                }
            }

            bw.write(n + "\n");
        }

        bw.close();
    }
}
