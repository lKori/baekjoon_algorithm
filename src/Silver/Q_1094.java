package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q_1094 {
    public static int bitwise(int n) {
        return n >> 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        if(x == 64) {
            System.out.print(1);

            return;
        }

        Deque<Integer> queue = new ArrayDeque<>();

        // 처음 가지고 있던 막대기
        int r = 64;
        queue.add(r);

        int total = r;

        while(true) {
            int newRod = 0;

            // 가장 짧은 막대기 자르기
            newRod = bitwise(queue.pollLast());

            // 가장 짧은 막대기를 자르고 자른 막대기 한개와 가지고 있는 막대기의 총합
            total -= newRod;

            if(total == x) {
                break;
            } else if(total > x) {
                // 총합이 크다면 다른 한부분은 버림
                queue.add(newRod);
            } else {
                // 총합이 작다면 자른 작대기 두개 다 버리지 않음
                queue.add(newRod);
                queue.add(newRod);

                total += newRod;
            }
        }

        System.out.print(queue.size() + 1);
    }
}
