package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> cards = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            cards.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(cards);

        int result = 0;

        for(int i = 0; i < cards.size() - 2; i++) {
            for(int j = i + 1; j < cards.size() - 1; j++) {
                for(int k = j + 1; k < cards.size(); k++) {
                    int sum = cards.get(i) + cards.get(j) + cards.get(k);

                    // 세 카드의 합이 이전의 합보다 크고 목표값보다 같거나 작을 경우 업데이트
                    if(sum > result && sum <= m) {
                        result = sum;
                    } else if(sum > m) {
                        // 세 카드의 합이 목표값 이상일 경우 이후 경우의 수는 고려할 필요X
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
