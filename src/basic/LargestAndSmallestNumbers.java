package basic;

import java.util.Scanner;

public class LargestAndSmallestNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        char choice;

        do {
            System.out.println("Enter numbers: ");
            number = console.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min)
                min = number;

            System.out.println("Do you want to continue y/n?");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest numbers: " + max);
        System.out.println("Smallest numbers: " + min);

    }
}
