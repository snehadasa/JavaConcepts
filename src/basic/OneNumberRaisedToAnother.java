package basic;

import java.util.Scanner;

public class OneNumberRaisedToAnother {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int base, power;
        double result = 1;

        System.out.println("Enter a base number");
        base = console.nextInt();

        System.out.println("Enter a power number");
        power = console.nextInt();

//        for (int i = 1; i <= power; i++)
//            result *= base;
//        System.out.println("Result " + result);

        result = Math.pow(base, power);
        System.out.println("Result " + result);

    }
}
