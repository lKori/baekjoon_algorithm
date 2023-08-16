package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q_10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        BigInteger[] dp = new BigInteger[n + 2];

        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;

        if(n == 0 || n == 1) {
            System.out.println(dp[n]);
        } else {
            for(int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1].add(dp[i - 2]);
            }
            System.out.println(dp[n]);
        }
    }
}
