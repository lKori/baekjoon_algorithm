package Bronze;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q_2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String seat = br.readLine();

        Deque<String> seats = new ArrayDeque<>();
        int result = 0;

        for(int i = 0; i < n; i++) {
            String s = String.valueOf(seat.charAt(i));

            if(s.equals("S")) {
                if(!seats.isEmpty()) {
                    if(seats.peekLast().equals("*")) {
                        seats.add(s);
                    } else {
                        seats.add("*");
                        seats.add(s);
                    }
                } else {
                    seats.add("*");
                    seats.add(s);
                }
            } else {
                if(!seats.isEmpty()) {
                    if(seats.peekLast().equals("S")) {
                        seats.add("*");
                        seats.add(s);
                    } else if(seats.peekLast().equals("L")) {
                        seats.add(s);
                        seats.add("*");
                    } else {
                        seats.add(s);
                    }
                } else {
                    seats.add("*");
                    seats.add(s);
                }
            }

            if(i == n - 1) {
                if(!seats.peekLast().equals("*")) {
                    seats.add("*");
                }
            }
        }

        while(!seats.isEmpty()) {
            String current = seats.poll();

            if(current.equals("*")) {
                if(!seats.isEmpty()) {
                    seats.poll();
                    result++;
                }
            } else if(current.equals("S")) {
                if(!seats.isEmpty()) {
                    if(seats.peek().equals("*")) {
                        seats.poll();
                        result++;
                    }
                }
            } else if(current.equals("L")) {
                if(!seats.isEmpty()) {
                    if(seats.peek().equals("*")) {
                        seats.poll();
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
