package Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();
        int total = 0;
        for(int i = 0; i < 3; i++) {
            int angle = Integer.parseInt(br.readLine());
            arr.add(angle);
            total += angle;
        }

        if(total != 180) {
            System.out.print("Error");
        } else if(arr.get(0) == 60 && arr.get(1) == 60 && arr.get(2) == 60) {
            System.out.print("Equilateral");
        } else if(arr.get(0) == arr.get(1) || arr.get(0) == arr.get(2) || arr.get(1) == arr.get(2)) {
            System.out.print("Isosceles");
        } else {
            System.out.print("Scalene");
        }
    }
}
