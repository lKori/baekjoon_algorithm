package Silver;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1018 {
    public static String[] blackFirst = new String[]{
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB"
    };
    public static String[] whiteFirst = new String[]{
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW"
    };
    public static String[] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int min = 65;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new String[n];

        for(int i = 0; i < n; i++) {
            board[i] = br.readLine();
        }

        int check = 0;

        for(int j = 0; j <= n - 8; j++) {
            for(int k = 0; k <= m - 8; k++) {
                int result = compareBoard(k, j);
                if(result < min) {
                    min = result;
                }
            }
        }

        bw.write(String.valueOf(min));

        bw.close();
    }

    public static int compareBoard(int x, int y) {
        int black = 0;
        int white = 0;

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(blackFirst[i].charAt(j) != board[i + y].charAt(j + x)) {
                    black++;
                }

                if(whiteFirst[i].charAt(j) != board[i + y].charAt(j + x)) {
                    white++;
                }
            }
        }

        return black <= white? black : white;
    }
}
