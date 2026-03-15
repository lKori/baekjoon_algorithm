package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_6764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean rise = true;
        boolean dive = true;
        boolean cons = true;

        int prevDepth = Integer.parseInt(br.readLine());

        for(int i = 0; i < 3; i++) {
            int depth = Integer.parseInt(br.readLine());

            if(depth > prevDepth) {
                dive = false;
                cons = false;
            } else if(depth < prevDepth) {
                rise = false;
                cons = false;
            } else {
                rise = false;
                dive = false;
            }

            prevDepth = depth;
        }

        if(rise) {
            System.out.print("Fish Rising");
        } else if(dive) {
            System.out.print("Fish Diving");
        } else if(cons) {
            System.out.print("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }
}
