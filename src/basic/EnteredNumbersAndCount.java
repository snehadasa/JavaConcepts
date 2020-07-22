package basic;

import java.util.Scanner;

public class EnteredNumbersAndCount {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number;
        int positive_count = 0, negative_count = 0, zero_count = 0;
        char choice;

        do {
            System.out.println("Enter number");
            number = console.nextInt();

            if (number > 0) {
                positive_count++;
            }
            else if (number < 0) {
                negative_count++;
            } else {
                zero_count++;
            }

            System.out.println("Do you wish to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Positive numbers:" + positive_count);
        System.out.println("Negative Count: " + negative_count);
        System.out.println("Zeros: " + zero_count);
    }
}
