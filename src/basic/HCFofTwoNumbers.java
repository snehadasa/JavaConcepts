package basic;

import java.util.Scanner;

public class HCFofTwoNumbers {

    public static void main(String[] args) {

      Scanner console = new Scanner(System.in);

      int dividend, divisor, remainder;
      int hcf = 0;

        System.out.println("Enter dividend");
        dividend = console.nextInt();

        System.out.println("Enter divisor");
        divisor = console.nextInt();

        do {
            remainder = dividend % divisor;

            if (remainder == 0)
                hcf = divisor;
            else {
                dividend = divisor;
                divisor = remainder;
            }
        }
        while (remainder != 0);

        System.out.println("HCF: " + hcf);
    }

}
