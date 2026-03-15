package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 현재 층 방 시작 번호
        int cf = 1;
        // 현재 층 수
        int f = 0;

        while(true) {
            if(n <= cf + f * 6) {
                System.out.println(f + 1);

                return;
            } else {
                cf += f * 6;
                f++;
            }
        }
    }
}
