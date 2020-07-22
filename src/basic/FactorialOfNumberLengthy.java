package basic;

public class FactorialOfNumberLengthy {
    public int factorialOfNumberLengthy(int n) {
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 4;
        FactorialOfNumber number = new FactorialOfNumber();
        int res = number.factorialOfNumber(n);
        System.out.println(res);
    }
}
