package Silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_10815 {
    public static int search(int[] cards, int card) {
        int start = 0;
        int end = cards.length - 1;

        boolean hasCard = false;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(cards[mid] == card) {
                hasCard = true;

                break;
            } else {
                if(cards[mid] < card) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        if(hasCard) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < m; j++) {
            int result = search(cards, Integer.parseInt(st.nextToken()));

            if(j == m - 1) {
                sb.append(result);
            } else {
                sb.append(result + " ");
            }
        }

        System.out.println(sb);
    }
}
