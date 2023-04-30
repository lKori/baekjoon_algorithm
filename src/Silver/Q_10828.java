package Silver;

import java.io.*;
import java.util.Stack;

public class Q_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            if(s.startsWith("push")) {
                String num = s.substring(s.lastIndexOf(" ") + 1);
                stack.push(num);
            } else if(s.startsWith("pop")) {
                if(stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if(s.startsWith("size")) {
                bw.write(stack.size() + "\n");
            } else if(s.startsWith("empty")) {
                if(stack.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if(s.startsWith("top")) {
                if(stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }

        bw.close();
    }
}
