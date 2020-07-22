package basic;

import java.util.Scanner;

public class SumOfFraction {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.println("Enter the value of n:");
        n = console.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += (1.0/i);
        }
        System.out.println("Sum: " + sum);
    }
}
