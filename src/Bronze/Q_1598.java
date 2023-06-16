package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1598 {
    public static int[] checkPos(int n1) {
        int x = 0;
        int y = 0;
        int n = 4 * x + 1;

        while(n1 >= n) {
            x++;
            n = 4 * x + 1;
        }

        x--;
        n = 4 * x + 1;

        y = n1 - n;

        return new int[] {x, y};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int[] pos1 = checkPos(n1);
        int[] pos2 = checkPos(n2);

        System.out.println(Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]));
    }
}
