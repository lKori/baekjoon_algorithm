package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;

public class Q_15829 {
    // java에서는 31^49 를 표현할 자료형이 없음 -> long 최대 범위 넘어감
    // BigInteger 객체를 이용하려 풀 수 있음
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        String s = br.readLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        BigInteger result = new BigInteger("0");

        for(int i = 1; i <= 26; i++) {
            hashMap.put(String.valueOf((char) (i + 96)), i);
        }

        for(int i = 0; i < l; i++) {
            long n = (long) hashMap.get(String.valueOf(s.charAt(i)));

            result = result.add(BigInteger.valueOf(n).multiply(BigInteger.valueOf(31).pow(i)));
        }

        System.out.print(result.remainder(BigInteger.valueOf(1234567891)));
    }
}
