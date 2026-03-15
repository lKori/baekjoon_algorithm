package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());

            arr.add(Integer.parseInt(st.nextToken()));
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int result1 = arr.get(0) + arr.get(3);
        int result2 = arr.get(1) + arr.get(2);

        System.out.println(result1 > result2 ? result2 : result1);
    }
}
