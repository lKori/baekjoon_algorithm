package Bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q_1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        BigInteger pass = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = 0;

        boolean good = true;

        for(int i = 2; i < k; i++) {
            if(pass.remainder(new BigInteger(String.valueOf(i))).intValue() == 0) {
                good = false;
                p = i;

                break;
            }
        }

        if(good) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD " + p);
        }
    }
}
