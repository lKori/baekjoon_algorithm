package Bronze;

import java.io.*;

public class Q_9316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            System.out.printf("Hello World, Judge %d!\n", i);
        }
    }
}
