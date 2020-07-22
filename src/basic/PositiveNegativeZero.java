package basic;

import java.util.Random;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        Random random = new Random();
        int randon_num = random.nextInt(1000);

        if (randon_num == 0)
            System.out.println("Number is 0");
        else if (randon_num % 2 == 0)
            System.out.println(randon_num + " is even");
        else
            System.out.println(randon_num + " is odd");
    }
}
