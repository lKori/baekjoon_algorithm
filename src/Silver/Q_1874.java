package Silver;

import java.io.*;
import java.util.Stack;

/*
BufferedWriter 로 풀 경우
버퍼 안에 데이터가 일정이상 찰 경우 자동으로 flush()가 되는데
NO가 결과인데 그 전에 flush()가 진행되면 출력초과 에러 발생함
*/
public class Q_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] sequence = new int[n];
        Stack<Integer> numStack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }


        int idx = 0;
        int number = 1;

        while(idx < n) {
            if(number <= sequence[idx]) {
                numStack.push(number);
                result.append("+\n");

                number++;
            } else if(number > sequence[idx]) {
                int popNum = numStack.pop();

                if(popNum == sequence[idx]) {
                    if(idx == sequence.length - 1) {
                        result.append("-");
                    } else {
                        result.append("-\n");
                    }

                    idx++;
                } else {
                    System.out.print("NO");

                    return;
                }
            }
        }

        System.out.println(result);
    }
}
