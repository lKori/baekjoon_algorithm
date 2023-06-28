package Bronze;

import java.io.*;

public class Q_6887 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = 1;
        int tile = Integer.parseInt(br.readLine());

        while(length * length <= tile) {
            length++;
        }

        System.out.printf("The largest square has side length %d.", length - 1);
    }
}
