import java.util.Scanner;

public class ReversePyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the reverse pyramid: ");
        int numRows = scanner.nextInt();

        for (int i = numRows; i >= 1; i--) {
            // Print spaces before the asterisks
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
        scanner.close();
    }
}