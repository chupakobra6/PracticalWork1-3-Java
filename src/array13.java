import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("N - нечётное число!");
            System.exit(0);
        }

        int[] a = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            a[i] = i;
        }
        for (int i = a.length - 2; i >= 0; i -= 2) {
            System.out.println(i);
        }

    }
}
