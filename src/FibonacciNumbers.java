public class FibonacciNumbers {
    public int fibonacci(int N) {
        if (N <= 1) {
            return N;
        }
        return (fibonacci(N - 1) + fibonacci(N - 2));
    }

    public static void main(String[] args) {
        int num = 10;
        int res = new FibonacciNumbers().fibonacci(num);
        System.out.println(res);;
    }
}
