package Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// Collections.sort()를 사용하기 위해서는 Comparable을 상속한 후 compareTo를 오버라이딩 해주어야 함
class User implements Comparable<User> {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(User u) {
        if(this.age > u.age) {
            return 1;
        } else if(this.age < u.age) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Q_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<User> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            User user = new User(Integer.parseInt(st.nextToken()), st.nextToken());

            arr.add(user);
        }

        Collections.sort(arr);

        for(int j = 0; j < arr.size(); j++) {
            bw.write(arr.get(j).age + " " + arr.get(j).name + "\n");
        }

        bw.close();
    }

}
