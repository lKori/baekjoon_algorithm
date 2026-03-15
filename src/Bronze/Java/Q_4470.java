package Bronze;

import java.io.*;

public class Q_4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i < n + 1; i++) {
            String s = br.readLine();

            System.out.println(i + ". " + s);
        }
    }
}
