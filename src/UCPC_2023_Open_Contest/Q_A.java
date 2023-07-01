package UCPC_2023_Open_Contest;

import java.io.*;

public class Q_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] directions = new String[]{"N", "E", "S", "W"};
        int d = 0;

        for(int i = 0; i < 10; i++) {
            int command = Integer.parseInt(br.readLine());

            if(command == 3) {
                if(d == 0) {
                    d = 3;
                } else {
                    d -= 1;
                }
            } else {
                d += command;
            }
        }

        System.out.print(directions[d % 4]);
    }
}
