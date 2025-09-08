public class IncDecExample{
    public static void main(String[] args){
        int x=10;
        System.out.println("Original:"+x);
        System.out.println("Post-increment:"+(x++));
        System.out.println("After Post-increment:"+x);
        System.out.println("Pre-increment:"+(++x));
        System.out.println("Post-decrement:"+(x--));
        System.out.println("Pre-decrement:"+(--x));
    }
}