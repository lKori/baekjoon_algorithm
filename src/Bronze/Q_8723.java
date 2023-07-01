package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_8723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        ArrayList<Double> sticks = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            double stick = Double.parseDouble(st.nextToken());

            sticks.add(stick);
        }

        Collections.sort(sticks);

        if(sticks.get(0).equals(sticks.get(1)) && sticks.get(0).equals(sticks.get(2))) {
            System.out.println(2);
        } else if(Math.pow(sticks.get(2), 2) == Math.pow(sticks.get(0), 2) + Math.pow(sticks.get(1), 2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
