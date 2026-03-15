package Bronze;

import java.io.*;
import java.util.Arrays;

public class Q_11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr1 = new int[4];
        int[] arr2 = new int[2];

        for(int i = 0; i < 4; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        for(int j = 0; j < 2; j++) {
            arr2[j] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1[1] + arr1[2] + arr1[3] + arr2[1]);
    }
}
