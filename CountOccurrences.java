import java.util.Scanner;
public class CountOccurrences {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 5, 20, 5, 30, 10, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();
        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("The number " + target + " appears " + count + " time(s) in the array.");
        scanner.close();
    }
}