package Silver;

import java.io.*;

public class Q_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int idx = 1;
        int num = 666;

        while(true) {
            if(n == idx) {
                bw.write(String.valueOf(num));
                break;
            } else {
                String s = String.valueOf(++num);

                // 숫자에 6이 연속으로 3개 이상 들어가는지 확인
                if(s.contains("666")) {
                    idx++;
                }
            }
        }

        bw.close();
    }
}
