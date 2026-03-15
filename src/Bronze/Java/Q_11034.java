package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11034 {
    public static int[] jump(int[] kang) {
        if(Math.abs(kang[0] - kang[1]) != 1 || Math.abs(kang[1] - kang[2]) != 1) {
            int tmp = kang[1];

            if(Math.abs(kang[0] - kang[1]) > Math.abs(kang[1] - kang[2])) {
                kang[1] = kang[1] - 1;
                kang[2] = tmp;
            } else {
                kang[1] = kang[1] + 1;
                kang[0] = tmp;
            }

            return kang;
        } else {
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String s;

        while((s = br.readLine()) != null) {
            st = new StringTokenizer(s);

            int[] kang = new int[3];
            int total = 0;

            kang[0] = Integer.parseInt(st.nextToken());
            kang[1] = Integer.parseInt(st.nextToken());
            kang[2] = Integer.parseInt(st.nextToken());

            while(true) {
                kang = jump(kang);

                if(kang == null) {
                    break;
                }

                total++;
            }

            bw.write(total + "\n");
        }

        bw.close();
    }
}
