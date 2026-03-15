package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        ArrayList<String> arr = new ArrayList<>();

        while(st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }

        System.out.print(Collections.frequency(arr, br.readLine()));
    }
}
