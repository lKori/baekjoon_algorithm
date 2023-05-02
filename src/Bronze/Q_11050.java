package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11050 {
    // 팩토리얼 계산 메서드
    public static long Factorial(int n) {
        // 0! == 1
        if(n == 0) {
            return 1;
        }

        int factorial = 1;

        for(int i = factorial; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if(k < 0 || k > n) {
            System.out.print("0");
        } else {
            long result = Factorial(n) / (Factorial(k) * (Factorial(n - k)));

            System.out.print(result);
        }
    }
}
