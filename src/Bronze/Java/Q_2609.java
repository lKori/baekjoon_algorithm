package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2609 {
    // 유클리드 호제법
    // a > b 일 때 a % b = result 일 때 r이 0이 되는 순간 a와 b의 최대공약수 구할 수 있음
    public static int euclidean(int a, int b) {
        if(b == 0) {
            return a;
        }

        return euclidean(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = 0;

        if(a > b) {
            gcd = euclidean(a, b);
        } else {
            gcd = euclidean(b, a);
        }

        System.out.println(gcd);
        // 최대공약수 = a * b / 두 수의 최대공약수
        System.out.println(a * b / gcd);
    }
}
