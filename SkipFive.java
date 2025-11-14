public class SkipFive {
    public static void main(String[] args) {

        System.out.println("Numbers from 1 to 10 (skipping 5):");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;  // Skip this iteration when i is 5
            }
            System.out.println(i);
        }
    }
}
