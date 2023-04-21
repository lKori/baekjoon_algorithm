package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        // 문제에서 입력되는 값 저장
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        // 가로 거리가 0에 가까운지 w에 가까운지 확인
        int width = w - x < x ? w -x : x;
        // 세로 거리가 0에 가까운지 h에 가까운지 확인
        int height = h - y < y ? h - y : y;

        // 가로와 세로 중 가까운 쪽 출력
        bw.write(String.valueOf(width < height ? width : height));

        bw.close();
    }
}
