package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_10156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int price = Integer.parseInt(st.nextToken());
        int ea = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        System.out.print(price * ea >= money ? price * ea - money : 0);
    }
}
