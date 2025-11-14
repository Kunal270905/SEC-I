import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Compare the two numbers
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}
