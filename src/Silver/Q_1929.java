package Silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Q_1929 {
    // 방법 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int x = (int) Math.sqrt(n);

        // m 부터 n 까지 배열 초기화
        int[] arr = IntStream.rangeClosed(m, n).toArray();

        // 1 제거
        arr = Arrays.stream(arr)
                .filter(num -> num != 1)
                .toArray();

        // 2부터 n까지 소수 구하기
        for(int i = 2; i <= x; i++) {
            int xi = i;

            arr = Arrays.stream(arr)
                    .filter(num -> num == xi || num % xi != 0)
                    .toArray();
        }

        for(int num : arr) {
            sb.append(num + "\n");
        }

        System.out.println(sb.toString());
    }

    // 방법 2
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//
//        int m = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        int x = (int) Math.sqrt(n);
//
//        for(int i = m; i <= n; i++) {
//            boolean dec = true;
//
//            // 1 제외
//            if(i == 1) {
//                continue;
//            }
//
//            // sqrt(i) 이하의 숫자의 배수에 대해서만 확인
//            for(int j = 2; j <= Math.sqrt(i); j++) {
//                if(i % j == 0) {
//                    dec = false;
//                    break;
//                }
//            }
//
//            if(dec) {
//                sb.append(i + "\n");
//            }
//        }
//
//        System.out.print(sb.toString());
//    }
}
