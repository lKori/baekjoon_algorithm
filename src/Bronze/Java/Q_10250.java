package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int c = Integer.parseInt(br.readLine());

        for(int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor = 0;
            int room = 0;

            if(n % h == 0) {
                // 나머지가 0일 경우 층수는 맨 꼭대기
                floor = h;
                room = n / h;
            } else {
                // 나머지가 0이 아닐 경우 층수는 나머지와 같음
                floor = n % h;
                room = (n / h) + 1;
            }

            System.out.printf("%d%02d\n", floor, room);
        }
    }
}
