package basic;

public class PrintTraiangle3 {
    public static void printTriangle3(int size) {
        int i = 0;
        int j = 0;

        if (size <= 0)
            System.out.println();
        for (i = 1; i  <= size; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" ");
            for (j = i; j < size; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 5;
        printTriangle3(size);
    }
}
