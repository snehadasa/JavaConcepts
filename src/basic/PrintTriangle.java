package basic;

public class PrintTriangle {
    public static void main(String[] args) {
        int size = 5;
        int i = 0;
        int j = 0;
        if (size <= 0)
            System.out.print('\n');

        for (i = 0; i < size; i++) {
            for (j = size - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)
                System.out.print("# ");
            System.out.println();
        }

    }
}
