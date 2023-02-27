import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("N > 0!");
            System.exit(0);
        }
        double a = 0;

        for (double i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                a -= 1 + i / 10;
            }
            else {
                a += 1 + i / 10;
            }
        }

        String result = String.format("%.2f", a);
        System.out.println("Result = " + result);
    }
}
