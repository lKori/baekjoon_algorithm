package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_2748 {
    public static String getPibo(int n, Map<Integer, String> pibo) {
        if(n == 0L || n == 1) {
            return pibo.get(n);
        }

        int n1 = n - 1;
        int n2 = n - 2;
        long pibo1 = 0;
        long pibo2 = 0;

        if(pibo.containsKey(n1))  {
            pibo1 = Long.parseLong(pibo.get(n1));
        } else {
            pibo1 = Long.parseLong(getPibo(n1, pibo));
        }

        if(pibo.containsKey(n2)) {
            pibo2 = Long.parseLong(pibo.get(n2));
        } else {
            pibo2 = Long.parseLong(getPibo(n2, pibo));
        }

        if(!pibo.containsKey(n)) {
            pibo.put(n, String.valueOf(pibo1 + pibo2));
        }

        return pibo.get(n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> pibo = new HashMap<>();

        pibo.put(0, "0");
        pibo.put(1, "1");

        int n = Integer.parseInt(br.readLine());

        System.out.println(getPibo(n, pibo));
    }
}
