package basic;

import java.util.Scanner;

public class InputNumberMultiplicaionTable {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = number.nextInt();

        for (int i = 1; i<= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
    }
}
