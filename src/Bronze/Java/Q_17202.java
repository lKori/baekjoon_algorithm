package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q_17202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String p1 = br.readLine();
        String p2 = br.readLine();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < 8; i++) {
            queue.add(p1.charAt(i) - '0');
            queue.add(p2.charAt(i) - '0');
        }

        int len = queue.size();
        int cnt = 1;
        while(queue.size() > 2) {
            if(cnt == (len - 1)) {
                int sum = queue.poll() + queue.poll();
                queue.add(sum < 10 ? sum : sum % 10);

                len = queue.size();
                cnt = 1;
            } else {
                int sum = queue.poll() + queue.peek();
                queue.add(sum < 10 ? sum : sum % 10);

                cnt++;
            }
        }

        System.out.println(queue.poll() + "" + queue.poll());
    }
}
