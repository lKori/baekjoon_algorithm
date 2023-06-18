package Bronze;

import java.io.*;

public class Q_6825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double weight = Double.parseDouble(br.readLine());
        double tall = Double.parseDouble(br.readLine());

        double bmi = weight / (tall * tall);

        if(bmi > 25) {
            System.out.println("Overweight");
        } else if(bmi < 18.5) {
            System.out.println("Underweight");
        } else {
            System.out.println("Normal weight");
        }
    }
}
