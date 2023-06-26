package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_7595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) {
                break;
            }

            for(int i = 1; i <= n; i++) {
                System.out.println("*".repeat(i));
            }
        }
    }
}
