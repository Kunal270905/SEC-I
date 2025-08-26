public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44, 55, 66, 77, 88};
        System.out.println("Odd numbers in the array:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}