//package basic;
//
//import java.util.Scanner;
//
//public class ReadsAndPrintsSum {
//
//    public static void main(String[] args) {
//
//        Scanner console = new Scanner(System.in);
//        int number, sumEven = 0, sumOdd = 0;
//        char choice;
//
//        do {
//            System.out.print("Enter numbers greater than 0 ");
//            number = console.nextInt();
//
//            if (number % 2 == 0) {
//                sumEven += number;
//            } else
//                sumOdd += number;
//
//            System.out.print("Do you want to continue y/n? ");
//            choice = console.next().charAt(0);
//        } while (choice == 'y' || choice == 'Y');
//
//        System.out.println("Even sum: " + sumEven);
//        System.out.println("Odd sum: " + sumOdd);
//    }
//}
