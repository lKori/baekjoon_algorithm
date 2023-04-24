package Silver;

import java.io.*;
import java.util.*;

// 시간 줄이기 도전 해볼 것
public class Q_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> freNum = new HashMap<>();
        int mid = arr.get((arr.size() - 1) / 2);

        for(int j = 0; j < arr.size(); j++) {
            int num = arr.get(j);

            sum += num;

            if(num > max) {
                max = num;
            }

            if(num < min) {
                min = num;
            }

            if(freNum.containsKey(num)) {
                freNum.replace(num, freNum.get(num), freNum.get(num) + 1);
            } else {
                freNum.put(num, 1);
            }
        }

        freNum.values().removeIf(value -> Collections.max(freNum.values()) > value);

        List<Integer> keySet = new ArrayList<>(freNum.keySet());

        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(freNum.get(o1).equals(freNum.get(o2))) {
                    return o1.compareTo(o2);
                } else {
                    return freNum.get(o2).compareTo(freNum.get(o1));
                }
            }
        });

        double avg = (double) sum / arr.size();

        bw.write((int) Math.round(avg) + "\n");
        bw.write(mid + "\n");
        bw.write((keySet.size() > 1 ? keySet.get(1) : keySet.get(0)) + "\n");
        bw.write(String.valueOf(max - min));

        bw.close();
    }
}
