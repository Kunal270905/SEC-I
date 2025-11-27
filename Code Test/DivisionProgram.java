import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer (dividend): ");
            int dividend = scanner.nextInt();
            System.out.print("Enter the second integer (divisor): ");
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero. Please enter a non-zero divisor.");
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
            System.out.println("Program finished.");
        }
    }
}