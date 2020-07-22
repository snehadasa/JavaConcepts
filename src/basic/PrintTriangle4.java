package basic;

public class PrintTriangle4 {
    public static void printTriangle4(int size) {
        int i = 0, j = 0;

        if (size <= 0)
            System.out.println();

        for (i = 0; i < size; i++) {
            for (j = size - i; j > 1; j--)
                System.out.print("* ");
            for (j = 0; j <= i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 5;
        printTriangle4(size);
    }
}
