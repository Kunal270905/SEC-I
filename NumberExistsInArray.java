import java.util.Scanner;
public class NumberExistsInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50, 60, 75};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(target + " exists in the array.");
        } else {
            System.out.println(target + " does not exist in the array.");
        }
        scanner.close();
    }
}