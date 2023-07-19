package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_28014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int total = 1;

        st = new StringTokenizer(br.readLine());

        int prevTower = Integer.parseInt(st.nextToken());

        for(int i = 1; i < n; i++) {
            int currentTower = Integer.parseInt(st.nextToken());
            if(prevTower <= currentTower) {
                total++;
            }

            prevTower = currentTower;
        }

        System.out.println(total);
    }
}
