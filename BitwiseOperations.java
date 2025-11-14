import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Perform bitwise operations
        int andResult = num1 & num2;   // Bitwise AND
        int orResult = num1 | num2;    // Bitwise OR
        int xorResult = num1 ^ num2;   // Bitwise XOR

        // Display results in decimal and binary form
        System.out.println("\nBitwise Operation Results:");
        System.out.println("----------------------------------");
        System.out.println("Number 1 (binary): " + Integer.toBinaryString(num1));
        System.out.println("Number 2 (binary): " + Integer.toBinaryString(num2));
        System.out.println("----------------------------------");
        System.out.println("AND  (num1 & num2): " + andResult + "  ->  " + Integer.toBinaryString(andResult));
        System.out.println("OR   (num1 | num2): " + orResult + "  ->  " + Integer.toBinaryString(orResult));
        System.out.println("XOR  (num1 ^ num2): " + xorResult + "  ->  " + Integer.toBinaryString(xorResult));

        input.close();
    }
}
