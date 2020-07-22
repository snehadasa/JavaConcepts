package basic;

public class AnyAmstrongNumber {
    public boolean isArmstrong(int num) {
        int duplicate_num = num;
        int length = 0;

        while (duplicate_num != 0) {
            duplicate_num /= 10;
            length++;
        }

        duplicate_num = num;
        int sum = 0;
        while (duplicate_num != 0) {
            sum += Math.pow(duplicate_num % 10, length);
            duplicate_num /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        AnyAmstrongNumber armstrong_num = new AnyAmstrongNumber();
        System.out.println(armstrong_num.isArmstrong(145));
    }
}