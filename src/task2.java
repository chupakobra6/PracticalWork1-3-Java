import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a <= 1) {
            System.out.println("A > 1!");
            System.exit(0);
        }
        double k = 1;
        double sum = 0;

        while (a >= sum + 1 / k) {
            sum += 1 / k;
            k += 1;
        }

        String strSum = String.format("%.5f", sum);
        System.out.println("К = " + (k - 1) + "\nSum = " + strSum);
    }
}
