package basic;

public class FactorialOfNumber {

    public int factorialOfNumber(int n) {
        if (n <= 1)
            return n;
        return n * factorialOfNumber(n - 1);
    }
    public static void main(String[] args) {
        int n = 4;
        FactorialOfNumber res = new FactorialOfNumber();
        int result = res.factorialOfNumber(n);
        System.out.println(result);
    }
}
