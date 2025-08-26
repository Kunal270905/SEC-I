public class FindMinimum {
    public static void main(String[] args) {
        int[] numbers = {15, 42, 7, 89, 23, 56, 99, 12};
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}