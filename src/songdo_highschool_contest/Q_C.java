package songdo_highschool_contest;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제 --------------------------------------------------------------
 * 송도고의 정보 선생님, 박상진 선생님은 송도고를 코딩을 좋아하는 친구라면 누구든지 들어오고 싶어 하는 명성이 자자한 학교로 만들고자 하는 야망이 있다.
 *
 * 박상진 선생님은 이를 위해 주 2회로 진행되는 알고리즘 특강을 개설하려 한다. 알고리즘 특강을 듣고자 하는 학생은 총  n명이며,
 * 각 학생은 월요일부터 금요일까지의 순서대로 각 요일의 수업 참가 가능 여부를 제출하였다. 각 학생은 2번의 특강에 모두 참가할 수 있어야 특강을 수강할 수 있다.
 *
 * 박상진 선생님을 도와 특강 일정을 어떻게 정해야 최대한 많은 학생이 알고리즘 특강을 수강할 수 있는지 구하는 프로그램을 작성하여라.
 *
 * 입력 --------------------------------------------------------------
 * 첫 번째 줄에 알고리즘 특강을 듣고자 하는 학생의 수  n이 주어진다.
 *
 * 두 번째 줄부터  n개의 줄에 걸쳐 각 i+1번째 줄에 i번째 학생의 요일별 참가 가능 여부를 의미하는 다섯 개의 정수 a_{i,1}, ..., a_{i,5}가 공백으로 구분되어 순서대로 주어진다.
 * 각 정수는 0 또는 1이며, 월요일부터 금요일까지의 순서대로 1이면 학생 i가 해당 요일에 참가할 수 있음을, 0이면 참가할 수 없음을 의미한다.
 *
 * 출력 --------------------------------------------------------------
 * 첫 번째 줄에 특강을 들을 수 있는 학생의 수의 최댓값을 출력한다.
 *
 * 두 번째 줄에 정수 다섯 개를 공백으로 구분하여 출력한다. 각 정수는 0 또는 1이어야 하며, 다섯 개의 정수 중 세 개는 0, 두 개는 1 이어야 한다.
 * 이는 월요일부터 금요일까지의 순서대로  1이면 특강을 하는 날, 0이면 특강을 하지 않는 날로 결정했을 때 수강할 수 있는 학생의 수가 최대임을 의미한다.
 * 가능한 특강 일정이 여러 가지인 경우 그중 아무것이나 출력하면 된다.
 *
 * 제한 --------------------------------------------------------------
 *
 * 1 ≤ n ≤ 10^6.
 * 1 ≤ i ≤ n, 1 ≤ j ≤ 5에 대해 a_{i,j}는 0 또는 1이다.
 */

public class Q_C {
    public static int check(int[][] students, int l1, int l2) {
        int total = 0;

        for(int i = 0; i < students.length; i++) {
            if(students[i][l1] == 1 && students[i][l2] == 1) {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] students = new int[n][5];
        int result = 0;
        int lesson1 = 0;
        int lesson2 = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for(int l = 0; l < 5; l++) {
                students[i][l] = Integer.parseInt(st.nextToken());
            }
        }

        for(int j = 0; j < 4; j++) {
            for(int k = j + 1; k < 5; k++) {

                int stuTotal = check(students, j, k);

                if(result <= stuTotal) {
                    result = stuTotal;
                    lesson1 = j;
                    lesson2 = k;
                }
            }
        }

        bw.write(result + "\n");

        for(int i1 = 0; i1 < 5; i1++) {
            if(i1 == lesson1 || i1 == lesson2) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }

        bw.close();
    }
}
