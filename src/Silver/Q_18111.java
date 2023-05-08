package Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 미해결
public class Q_18111 {
    public static int timeCheck(ArrayList<Integer> list, int height, long block) {
        ArrayList<Integer> stackList = new ArrayList<>(list);
        ArrayList<Integer> digList = new ArrayList<>(list);
        long inventoryBlock = block;
        int stackTime = 0;
        int digTime = 0;

        for(int i = 0; i < list.size(); i++) {
            if(stackTime > block || block == 0) {
                stackTime = Integer.MAX_VALUE;
            } else {
                if(stackList.get(i) < height) {
                    int time = height - stackList.get(i);
                    stackList.set(i, height);
                    stackTime += time;
                }
            }

            if(digList.get(i) > height) {
                int time = (digList.get(i) - height) * 2;
                digList.set(i, height);
                digTime += time;
            }
        }

        boolean stack = Collections.frequency(stackList, height) == list.size();
        boolean dig = Collections.frequency(digList, height) == list.size();


        if(!stack) {
            stackTime = Integer.MAX_VALUE;
        }

        if(!dig) {
            digTime = Integer.MAX_VALUE;
        }

        if(!stack && !dig) {
            return -1;
        }

        return stackTime > digTime ? digTime : stackTime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        int maxHeight = 0;
        int height = 0;
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                int blockHeight = Integer.parseInt(st.nextToken());
                list.add(blockHeight);

                if(blockHeight > maxHeight) {
                    maxHeight = blockHeight;
                    height = blockHeight;
                }
            }
        }

        while(height >= 0) {
            int time = timeCheck(list, height, b);

            if(time != -1 && time < result) {
                result = time;
                maxHeight = height;
            }

            height--;
        }

        System.out.print(result + " " + maxHeight);
    }
}
