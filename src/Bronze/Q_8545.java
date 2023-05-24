package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_8545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String s = br.readLine();

        StringBuilder sb = new StringBuilder(s);

        s = sb.reverse().toString();

        System.out.print(s);
    }
}
