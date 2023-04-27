package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sugar = Integer.parseInt(br.readLine());

        int count = Integer.MAX_VALUE;

        // 5kg 가방을 최대한 많이 사용한 상태에서 시작
        for(int i = sugar / 5; i >= 0; i--) {
            int left = 0;

            if(i == 0) {
                left = sugar;
            } else {
                left = sugar - (i * 5);
            }

            if(left % 3 == 0) {
                int tb = left / 3;

                if(count > i + tb) {
                    count = i + tb;
                }
            }
        }

        // 만약 한번도 나누어 떨어지지 않았다면 초기 값과 동일
        System.out.print(count != Integer.MAX_VALUE ? count : -1);
    }
}
