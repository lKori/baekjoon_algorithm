package Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_1920 {
    public static int findNumber(int num, ArrayList<Integer> numbers) {
        int start = 0;
        int end = numbers.size() - 1;

        while(start < end) {
            int mid = (start + end) / 2;

            if(num == numbers.get(start) || num == numbers.get(end) || num == numbers.get(mid)) {
                return 1;
            } else if(num > numbers.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n1 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();

        while(st.hasMoreTokens()) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        // 이진탐색을 위해 정렬
        Collections.sort(numbers);

        int n2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int j = 0; j < n2; j++) {
            int num = Integer.parseInt(st.nextToken());

            sb.append(findNumber(num, numbers) + "\n");
        }

        System.out.print(sb);
    }
}
