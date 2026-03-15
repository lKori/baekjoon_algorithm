package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_24416 {
    public static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) {
        int action = 0;

        int[] fibos = new int[n + 1];
        fibos[1] = 1;
        fibos[2] = 1;

        for(int i = 3; i <= n; i++) {
            action++;
            fibos[i] = fibos[i - 1] + fibos[i - 2];
        }
        return action;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(fib(n) + " " + fibonacci(n));
    }
}
