package basic;

import java.util.Scanner;

public class TellsIfNumberIsPrime {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number, i, flag = 0;
        int m = 0;

        System.out.println("Enter a positive integer ");
        number = console.nextInt();

        System.out.println
                ("The number you have entered is " + number);

        m = number / 2;

        if (number == 0 || number == 1)
            System.out.println(number + "is not prime number");
        else {
            for (i = 2; i <= m; i++) {
                if (number % i == 0) {
                    System.out.println(number + "is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(number + "is prime");
            }
        }

//        if (number <= 0) {
//            System.out.println(number + "is not a prime number");
//        }
//
//        for (i = 2; i < number; i++) {
//            if (number % i == 0)
//                System.out.println(number + "is not a prime");
//        }
//        System.out.println(number + "is prime");
    }
}
