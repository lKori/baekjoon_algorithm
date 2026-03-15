package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] arr = new int[30];

        for(int i = 1; i <= 30; i++) {
            arr[i - 1] = i;
        }

        for(int j = 0; j < 28; j++) {
            int n = Integer.parseInt(br.readLine());

            arr[n - 1] = 0;
        }

        for(int k = 0; k < arr.length; k++) {
            if(arr[k] != 0) {
                bw.write(arr[k] + "\n");
            }
        }

        bw.close();
    }
}
