package Bronze;

import java.io.*;

public class Q_4714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true) {
            double e_weight = Double.parseDouble(br.readLine());

            if(e_weight < 0) {
                break;
            }

            double m_weight = e_weight * 0.167;

            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", e_weight, m_weight);
        }
    }
}
