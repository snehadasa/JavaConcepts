package basic;

public class PrintTriangle2 {
    public static void printTriangle2(int size) {
        int i, j;
        if (size <= 0)
            System.out.print('\n');
        for (i = 1; i <= size; i++) {
            for (j = i; j < size; j++) {
                System.out.print(' ');
            }
            for (j = 1; j <= i; j++)
                System.out.print('*');
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
    int size = 5;
    printTriangle2(size);
    }
}
