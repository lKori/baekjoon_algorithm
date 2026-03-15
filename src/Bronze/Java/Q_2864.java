package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2864 {
    public static int toSixOrFive(String num, char mode) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == mode) {
                sb.append(mode == '5' ? '6' : '5');
            } else {
                sb.append(num.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int a1 = toSixOrFive(a, '6');
        int b1 = toSixOrFive(b, '6');

        int a2 = toSixOrFive(a, '5');
        int b2 = toSixOrFive(b, '5');

        int[] result = {a1 + b1, a1 + b2, a2 + b1, a2 + b2};
        int max = result[0];
        int min = result[0];

        for(int j = 1; j < 4; j++) {
            if(result[j] > max) {
                max = result[j];
            }

            if(result[j] < min) {
                min = result[j];
            }
        }

        System.out.printf("%d %d", min, max);
    }
}
