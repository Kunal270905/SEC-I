public class CountGreaterThan50 {
    public static void main(String[] args) {
        int[] numbers = {10, 75, 23, 64, 52, 48, 90, 33};
        int count = 0;
        for (int num : numbers) {
            if (num > 50) {
                count++;
            }
        }
        System.out.println("Count of numbers greater than 50: " + count);
    }
}