package basic;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int digit1, digit2, digit3;

        for (int num = 100; num <= 500; num++) {
            int temp = num;
            digit1 = temp % 10;

            temp = temp / 10;
            digit2 = temp % 10;

            temp = temp / 10;
            digit3 = temp % 10;

           if (digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == num)
               System.out.println(num);
        }
    }
}
