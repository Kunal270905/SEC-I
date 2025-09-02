import java.util.Scanner;
public class FirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (str.length() > 0) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("First character: " + firstChar);
            System.out.println("Last character: " + lastChar);
        } else {
            System.out.println("Empty string entered!");
        }
        sc.close();
    }
}