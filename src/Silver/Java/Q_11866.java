package Silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_11866 {
    // 방법 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        int idx = k - 1;

        while(!list.isEmpty()) {
            if(list.size() == 1) {
                queue.add(list.get(0));

                break;
            }

            if(idx >= list.size()) {
                idx -= list.size();

                continue;
            }

            queue.add(list.remove(idx));
            idx += k - 1;
        }

        bw.write("<");

        while(!queue.isEmpty()) {
            if(queue.size() == 1) {
                bw.write(queue.poll() + ">");
            } else {
                bw.write(queue.poll() + ", ");
            }
        }

        bw.close();
    }

    // 방법 2 (큐 활용)
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//
//        Queue<Integer> queue = new LinkedList<>();
//
//        for(int i = 0; i < n; i++) {
//            queue.add(i + 1);
//        }
//
//        bw.write("<");
//
//        while(true) {
//            for(int j = 0; j < k - 1; j++) {
//                queue.add(queue.poll());
//            }
//
//            bw.write(String.valueOf(queue.poll()));
//
//            if(!queue.isEmpty()) {
//                bw.write(", ");
//            } else {
//                bw.write(">");
//                break;
//            }
//        }
//
//        bw.close();
//    }
}
