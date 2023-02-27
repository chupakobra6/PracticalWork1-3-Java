import java.util.Scanner;

public class matrix14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        int[][] a = new int[m][m];

        for (int i = 0; i < m * m; i++) {
            a[i / m][i % m] = (i / m + 1) * (i % m + 1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                if (j != m - i - 1) {
                    System.out.println(a[i][j] + " ");
                }
                else {
                    System.out.print(a[i][j] + " ");
                }
            }
            for (int j = 1; j < m; j++) {
                if (j > i) {
                    System.out.print(a[m - i - 1][j] + " ");
                }
            }

            System.out.println();
            System.out.println();
        }
    }
}
