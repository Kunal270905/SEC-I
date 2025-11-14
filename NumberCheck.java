 import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if number is positive, negative, or zero
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();
    }
}
