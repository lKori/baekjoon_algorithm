package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        // 하루 올라갈 수 있는 높이는 a - b 이므로 (v - b) / (a - b) 는 도달하기 직전 날까지 올라간 날짜 -> 다음날에는 반드시 도달
        // ceil을 통해 +1일을 해주면 도달한 날짜
        System.out.print((int) Math.ceil((double) (v - b) / (a - b)));
    }
}
