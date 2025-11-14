import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Use ternary operator to check even or odd
        String result = (num % 2 == 0) ? "Even" : "Odd";

        // Display the result
        System.out.println("The number " + num + " is " + result + ".");

        input.close();
    }
}
