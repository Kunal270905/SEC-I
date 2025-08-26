public class CopyArray {
    public static void main(String[] args) {
        int[] original = {5, 10, 15, 20, 25};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println("Copied array elements:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}