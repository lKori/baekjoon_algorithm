package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q_8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger apple = new BigInteger(br.readLine());
        BigInteger m = new BigInteger(br.readLine());

        BigInteger n;

        n = apple.add(m).divide(new BigInteger("2"));

        System.out.println(n + "\n" + n.subtract(m));
    }
}
