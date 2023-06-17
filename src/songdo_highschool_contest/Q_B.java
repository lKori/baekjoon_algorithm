package songdo_highschool_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제 --------------------------------------------------------------
 * 송도고에서는 점심시간만 되면 밥을 일찍 먹으려는 학생들이 레이스를 펼친다.
 *
 * 학교 본관은 n개의 층으로 이루어져 있으며 모든 층에는 계단, m개의 교실, 계단이 순서대로 배치되어 있다.
 * 각 교실과 계단은 하나의 칸으로서 표현된다. 한 칸을 이동하는 데에는 1분이 걸리고, 층간 이동은 계단을 통해서만 할 수 있다.
 * 송도고의 점심시간 레이스에는 총 k개의 반이 참가하며, 각 반은 1번부터 k번까지의 번호로 구분된다.
 * i번째 반이 점심시간 직전에 수업을 진행하는 교실의 위치는 f_i층의 왼쪽 계단 칸으로부터 d_i칸 떨어진 교실이다.
 * 각 반의 학생들은 급식실과 연결된 문을 향해 항상 가장 빠른 경로로 움직인다.
 * 급식실에 가장 먼저 도착하는 반이 레이스에서 우승한다. 단, 각 반의 위치는 겹칠 수 있음에 유의하라.
 *
 * 혼란에 빠진 송도고를 위해 점심시간 레이스에서 우승할 반을 구하는 프로그램을 작성하여라.
 *
 * 입력 --------------------------------------------------------------
 * 첫 번째 줄에는 학교의 층수 n, 한 층에 있는 교실의 수 m, 레이스에 참가하는 반의 수 k가 공백으로 구분되어 주어진다.
 * 이어서 k개의 각 i+1번째 줄에 i번째 반이 점심시간 직전에 수업을 진행하는 교실의 위치를 나타내는 정수 f_i와 d_i가 공백으로 구분되어 주어진다.
 *
 * 출력 --------------------------------------------------------------
 * 점심시간 레이스에서 우승할 반의 번호를 출력한다.
 *
 * 공동 우승할 반이 존재한다면 공동 우승하는 반들 중 번호가 가장 작은 반의 번호를 출력한다.
 *
 * 제한 --------------------------------------------------------------
 *
 * 1 ≤ n , m , k ≤ 100,000.
 * 1 ≤ f_i ≤ n.
 * 1 ≤ d_i ≤ m.
 *
 */

public class Q_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int win = 0;
        int time = Integer.MAX_VALUE;

        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            int f = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int x = m - d;
            int y = f - 1;

            if(time > x + y) {
                win = i;
                time = x + y;
            }
        }

        System.out.println(win + 1);
    }
}
