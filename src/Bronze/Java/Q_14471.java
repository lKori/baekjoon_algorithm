package Bronze;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_14471 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int complete = 0;
        int change = 0;

        Integer[] stamp = new Integer[m];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            stamp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(stamp, Collections.reverseOrder());

        for(int s : stamp) {
            if(complete >= m - 1) {
                break;
            }

            if(s < n) {
                change += n - s;
            }

            complete++;
        }

        System.out.println(change);
    }
}
