public class CompoundAssignmentDemo {
    public static void main(String[] args) {
        int num = 10;  // initial value

        System.out.println("Initial value: " + num);

        // += operation (addition assignment)
        num += 5;  // same as num = num + 5
        System.out.println("After += 5, num = " + num);

        // -= operation (subtraction assignment)
        num -= 3;  // same as num = num - 3
        System.out.println("After -= 3, num = " + num);

        // *= operation (multiplication assignment)
        num *= 4;  // same as num = num * 4
        System.out.println("After *= 4, num = " + num);
    }
}
