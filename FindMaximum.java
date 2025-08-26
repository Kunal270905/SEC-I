public class FindMaximum {
    public static void main(String[] args) {
        int[] numbers = {15, 42, 7, 89, 23, 56, 99, 12};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}