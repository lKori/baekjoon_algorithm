package Silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1966 {
    public static boolean checkValue(int firstNum, Queue<Integer> queue) {
        // 큐를 배열로 변환
        int[] arr = queue.stream().mapToInt(Integer::intValue).toArray();

        // 만약 현재 문서보다 중요도가 높은 문서가 있으면 false 반환
        for(int i = 0; i < arr.length; i++) {
            if(firstNum < arr[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int test = Integer.parseInt(br.readLine());

        for(int i = 0; i < test; i++) {
            Queue<Integer> doc = new LinkedList<>();
            int count = 1;

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                doc.add(Integer.parseInt(st.nextToken()));
            }

            while(!doc.isEmpty()) {
                // 현재 큐 사이즈 저장
                int size = doc.size();
                // 큐 첫번쨰 인자 빼기
                int pollNum = doc.poll();

                if(checkValue(pollNum, doc)) {
                    // 현재 문서가 목표일 경우 현재 프린트 순서 출력 후 while문 탈출
                    if(m == 0) {
                        bw.write(count + "\n");

                        break;
                    } else {
                        m--;
                    }
                } else {
                    // 현재 문서가 프린트 할 순서가 아닐 경우 맨 마지막 순서로 이동
                    doc.add(pollNum);

                    // 목표 문서가 맨 뒤로 갈 경우 마지막 번호로 초기화
                    if(m == 0) {
                        m = doc.size() - 1;
                    } else {
                        m--;
                    }
                }

                // 처음 사이즈보다 작아졌을 경우 프린트가 진행되었다는 뜻이므로 다음 출력 번호로 업데이트
                if(size != doc.size()) {
                    count++;
                }
            }
        }

        bw.close();
    }
}
