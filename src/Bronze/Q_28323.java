package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_28323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int k = 1;

        st = new StringTokenizer(br.readLine());

        int prevNum = Integer.parseInt(st.nextToken());

        for(int i = 1; i < n; i++) {
            int currentNum = Integer.parseInt(st.nextToken());

            if(prevNum % 2 == 0) {
                if(currentNum % 2 != 0) {
                    k++;
                }
            } else {
                if(currentNum % 2 == 0) {
                    k++;
                }
            }

            prevNum = currentNum;
        }

        System.out.println(k);
    }
}
