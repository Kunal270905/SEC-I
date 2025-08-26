import java.util.Scanner;
public class FindIndex {
    public static void main(String[] args) {
        int[] numbers = {15, 30, 45, 60, 75, 90};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("The number " + target + " is at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The number " + target + " is not in the array.");
        }
        scanner.close();
    }
}