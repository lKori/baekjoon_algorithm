package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());

            int man = Integer.parseInt(st.nextToken());
            int girl = Integer.parseInt(st.nextToken());

            if(man == 0 && girl == 0) {
                break;
            } else {
                bw.write((man + girl) + "\n");
            }
        }

        bw.close();
    }
}
