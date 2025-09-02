import java.util.Scanner;
public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String modifiedStr = str.replace('a', 'o');
        System.out.println("Modified string: " + modifiedStr);
        sc.close();
    }
}