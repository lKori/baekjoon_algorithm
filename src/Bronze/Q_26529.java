package Bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Q_26529 {
    static Map<Integer, Integer> fibos = new HashMap<>();

    public static int fibo(int f) {
        if(!fibos.containsKey(f)) {
            fibos.put(f, fibo(f - 1) + fibo(f - 2));
        }

        return fibos.get(f);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        fibos.put(0, 1);
        fibos.put(1, 1);

        for(int i = 0; i < n; i++) {
            int f = Integer.parseInt(br.readLine());

            bw.write(fibo(f) + "\n");
        }

        bw.close();
    }
}
