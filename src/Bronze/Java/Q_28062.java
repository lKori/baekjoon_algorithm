package Bronze;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_28062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int[] candy = new int[n];
        int odd = 0;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            candy[i] = Integer.parseInt(st.nextToken());

            if(candy[i] % 2 != 0) {
                odd++;
            }
        }

        if(odd % 2 == 0) {
            for(int j = 0; j < candy.length; j++) {
                sum += candy[j];
            }
        } else {
            Arrays.sort(candy);

            for(int j = candy.length - 1; j >= 0; j--) {
                if(candy[j] % 2 == 0) {
                    sum += candy[j];
                } else {
                    if(odd != 1) {
                        sum += candy[j];
                        odd--;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
