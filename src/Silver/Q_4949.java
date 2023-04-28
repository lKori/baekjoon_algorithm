package Silver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String s = br.readLine();
            Deque<String> stack = new ArrayDeque<>();
            boolean symmetry = true;

            // "." 입력 시 while문 종료
            if(s.equals(".")) {
                break;
            }

            for(Character c : s.toCharArray()) {
                // "(" 또는 ")" 일 경우 stack에 push
                if(c.equals('(') || c.equals('[')) {
                    stack.push(String.valueOf(c));
                } else if(c.equals(')')) {
                    // ")" 일 경우 stack에 해당 짝과 맞게 pop이 되는지 확인
                    if(stack.isEmpty() || !stack.pop().equals("(")) {
                        symmetry = false;

                        break;
                    }
                } else if(c.equals(']')) {
                    // "]" 일 경우 stack에 해당 짝과 맞게 pop이 되는지 확인
                    if(stack.isEmpty() || !stack.pop().equals("[")) {
                        symmetry = false;

                        break;
                    }
                }
            }

            // stack이 비어있지 않다면 ( 또는 [ 가 짝이 맞지 않는 상황
            if(symmetry && stack.isEmpty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.close();
    }
}
