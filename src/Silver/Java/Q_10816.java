package Silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        while(st.hasMoreTokens()) {
            String card = st.nextToken();

            // 동일한 카드가 있을 경우 카드 소지 수 업데이트
            if(map.containsKey(card)) {
                map.replace(card, map.get(card), map.get(card) + 1);
            } else {
                // 새로운 카드일 경우 등록
                map.put(card, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            String findCard = st.nextToken();

            if(map.containsKey(findCard)) {
                bw.write(map.get(findCard) + " ");
            } else {
                // 해당 키가 없을 경우 null 값이 출력되므로
                bw.write("0 ");
            }
        }

        bw.close();
    }
}
