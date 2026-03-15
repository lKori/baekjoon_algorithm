package Bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> cards = new HashMap<>();
        boolean bell = false;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            Integer value = Integer.parseInt(st.nextToken());

            if(cards.containsKey(name)) {
                cards.replace(name, cards.get(name) + value);
            } else {
                cards.put(name, value);
            }
        }

        for(String key : cards.keySet()) {
            if(cards.get(key) == 5) {
                bell = true;
            }
        }

        System.out.println(bell ? "YES" : "NO");
    }
}
