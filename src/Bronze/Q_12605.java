package Bronze;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            bw.write("Case #" + (i + 1) + ": ");
            Stack<String> words = new Stack<>();

            while(st.hasMoreTokens()) {
                words.add(st.nextToken());
            }

            while(!words.isEmpty()) {
                bw.write(words.pop() + " ");
            }

            bw.write("\n");
        }

        bw.close();
    }
}
