package Silver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<String> queue = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            if(s.startsWith("push")) {
                String num = s.substring(s.lastIndexOf(" ") + 1);
                queue.add(num);
            } else if(s.startsWith("pop")) {
                if(queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.poll() + "\n");
                }
            } else if(s.startsWith("size")) {
                bw.write(queue.size() + "\n");
            } else if(s.startsWith("empty")) {
                if(queue.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if(s.startsWith("front")) {
                if(queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.getFirst() + "\n");
                }
            } else if(s.startsWith("back")) {
                if(queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.getLast() + "\n");
                }
            }
        }

        bw.close();
    }
}
