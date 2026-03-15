package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_18238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char current = 'A';

        int total = 0;

        for(char c : s.toCharArray()) {
            int left = 0;
            int right = 0;

            if(current > c) {
                left = current - c;
                right = (91 - current) + (c - 65);
            } else if(current < c) {
                left = (current - 65) + (91 - c);
                right = c - current;
            }

            total += left >= right ? right : left;
            current = c;
        }

        System.out.println(total);
    }}
