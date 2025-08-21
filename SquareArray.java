public class SquareArray {
    public static void main(String[] args) {
        int[] squares = new int[10];
        for (int i = 0; i < 10; i++) {
            squares[i] = (i + 1) * (i + 1);
        }
        System.out.println("Squares of numbers from 1 to 10:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Square of " + (i + 1) + ": " + squares[i]);
        }
    }
}