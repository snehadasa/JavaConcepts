package basic;

import java.util.Random;
import java.util.Scanner;

public class GuessRightNumber {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int num, guess, tries = 0;

        num = (int) (Math.random() * 10) + 1;

        System.out.println("Guess my number");
        System.out.println();

        do {
            System.out.println("Enter a number ");
            guess = number.nextInt();

            tries++;

            if (guess > num) {
                System.out.println("Too high! Try Again");
            } else if (guess < num) {
                System.out.println("Too low! Try Again");
            } else {
                System.out.println("You have guessed it right in " + tries + "tries");
            }
        }

        while (guess != num);
    }
}
