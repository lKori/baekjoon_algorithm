package Bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Q_15841 {
    static Map<Integer, BigInteger> fibos = new HashMap<>();

    public static BigInteger fibo(int f) {
        if(!fibos.containsKey(f)) {
            fibos.put(f, fibo(f - 1).add(fibo(f - 2)));
        }

        return fibos.get(f);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        fibos.put(0, new BigInteger("0"));
        fibos.put(1, new BigInteger("1"));

        while(true) {
            String s = br.readLine();

            if(s.equals("-1")) {
                break;
            }

            BigInteger cow = fibo(Integer.parseInt(s));

            System.out.printf("Hour %s: %s cow(s) affected\n", s, cow.toString());
        }
    }
}
