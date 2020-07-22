package basic;

public class FizzBuzz {

    public static void main(String[] args) {

        int n = 100;

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                System.out.print("fizzbuzz" + " ");
            else if (i % 3 == 0)
                System.out.print("fizz" + " ");
            else if (i % 5 == 0)
                System.out.print("buzz" + " ");
            else
                System.out.print(i + " ");
        }
    }
}
