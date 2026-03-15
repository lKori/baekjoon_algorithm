package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());

            ArrayList<Integer> arr = new ArrayList<>();

            while(st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            // 길이 순으로 정렬
            Collections.sort(arr);

            if(arr.get(0) == 0 && arr.get(1) == 0 && arr.get(2) == 0) {
                break;
            } else {
                bw.write((arr.get(0) * arr.get(0)) + (arr.get(1) * arr.get(1)) == arr.get(2) * arr.get(2) ? "right\n" : "wrong\n");
            }
        }

        bw.close();
    }
}
