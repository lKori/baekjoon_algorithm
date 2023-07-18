package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int milk = 0;
        int total = 0;

        for(int i = 0; i < n; i++) {
            if(Integer.parseInt(st.nextToken()) == milk) {
                total++;
                if(milk == 2) {
                    milk = 0;
                } else {
                    milk++;
                }
            }
        }

        System.out.println(total);
    }
}
