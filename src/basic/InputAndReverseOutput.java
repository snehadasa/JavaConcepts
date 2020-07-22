package basic;

import java.util.Scanner;

public class InputAndReverseOutput {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number, reverse = 0;

        System.out.println("Enter a number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        System.out.println("Result: " + reverse);

    }
}
