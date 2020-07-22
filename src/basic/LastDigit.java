package basic;

import java.util.Random;

public class LastDigit {

    public static void main(String[] args) {
        Random random = new Random();
        int random_num = random.nextInt(1000);
        //int n;
        int last_digit;

        //for (n = 0; n <= 10; n++) {
        last_digit = random_num % 10;
        System.out.println(random_num);
        System.out.println(last_digit);
        //}
    }
}
