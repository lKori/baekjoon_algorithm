package Silver;

import java.io.*;
import java.util.Stack;

public class Q_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            Stack<String> stack = new Stack<>();
            boolean vps = true;

            for(Character c : s.toCharArray()) {
                if(c.equals('(')) {
                    stack.push(String.valueOf(c));
                } else {
                    if(stack.isEmpty() || !stack.pop().equals("(")) {
                        vps = false;

                        break;
                    }
                }
            }

            if(vps && stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.close();
    }
}
