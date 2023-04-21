package Silver;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1018 {
    // black이 먼저 시작되는 패턴
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

    // white가 먼저 시작되는 패턴
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
    public static String[] board; // 문제에서 주어지는 보드판

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int min = 65; // 8x8 크기로 잘라내므로 모두 다시 칠하더라도 64칸이 최대이기 때문에 모든 경우의 수는 65 미만

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 체스판의 세로 길이
        int m = Integer.parseInt(st.nextToken()); // 체스판의 가로 길이

        board = new String[n];

        for(int i = 0; i < n; i++) {
            board[i] = br.readLine(); // 문제에서 입력 받은 보드판 저장
        }

        // 8x8 크기로 잘라내므로 보드판 크기에서 8을 뺀 값이 가로, 세로로 움직일 수 있는 칸 수
        for(int j = 0; j <= n - 8; j++) {
            for(int k = 0; k <= m - 8; k++) {
                // 비교를 시작하는 좌표 (x, y) == (k, j)
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
        int black = 0; // black이 먼저 시작하는 패턴일 경우 칠해야 하는 칸 수
        int white = 0; // white가 먼저 시작하는 패턴일 경우 칠해야 하는 칸 수

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                // 보드판의 경우 매개변수로 받은 시작좌표에서부터 비교를 시작해야 하므로 i + y, j + x
                if(blackFirst[i].charAt(j) != board[i + y].charAt(j + x)) {
                    black++;
                }

                if(whiteFirst[i].charAt(j) != board[i + y].charAt(j + x)) {
                    white++;
                }
            }
        }

        // 더 적게 칠하는 경우의 수를 반환
        return black <= white? black : white;
    }
}
