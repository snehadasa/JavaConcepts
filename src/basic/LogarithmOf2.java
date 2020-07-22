package basic;

import java.util.Scanner;

public class LogarithmOf2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n;
        double sum = 0, logarithm;
        //int sign = -1;

        System.out.println("Enter the value of n: ");
        n = console.nextInt();

        for (int i = 1; i <= n; i++) {
            logarithm = Math.log(1.0/i) / Math.log(2);
            //sum += (1.0 * sign) / i;
            //sign *= -1;
            sum += logarithm;
        }

        System.out.println("Sum: " + sum);

    }
}
