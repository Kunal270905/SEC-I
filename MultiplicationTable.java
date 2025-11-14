import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number to print its multiplication table: ");
        int num = input.nextInt();

        // Print multiplication table using for loop
        System.out.println("\nMultiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " × " + i + " = " + (num * i));
        }

        input.close();
    }
}
