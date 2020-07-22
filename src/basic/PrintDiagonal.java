package basic;

public class PrintDiagonal {

    public static void printDiagonal(int n) {
        int i = 0, j = 0;

        if (n <= 0)
            System.out.println();
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(' ');
            }
            System.out.print('\\');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 7;
        printDiagonal(n);
    }
}
