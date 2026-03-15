package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            // 입력 값이 0이 아닐 때
            if(n != 0) {
                stack.push(n);
            } else {
                // 입력 값이 0일 때
                stack.pop();
            }
        }

        // stack 안의 요소 합
        int sum = stack.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.print(sum);
    }
}
