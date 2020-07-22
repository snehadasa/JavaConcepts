package basic;

import java.util.Scanner;

public class ScannerEnterSum {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number1, number2, sum = 0;
        char choice;

        do {
            System.out.println("Enter number1: ");
            number1 = console.nextInt();

            System.out.println("Enter number2: ");
            number2 = console.nextInt();

            sum = number1 + number2;
            System.out.println("Sum of Two numbers: " + sum);

            System.out.println("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

            System.out.println();
        } while (choice == 'y' || choice == 'Y');

        }
    }
