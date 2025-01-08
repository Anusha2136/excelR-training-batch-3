public class Demo014 {
    public static void main(String[] args) {
        int number = 10;
        boolean flag = false;
        System.out.println("Number: " + number);
        System.out.println("Unary plus: " + (+number));
        System.out.println("Unary minus: " + (-number));
        System.out.println("Pre-increment: " + (++number)); 
        System.out.println("Post-increment: " + (number++)); 
        System.out.println("After post-increment, number: " + number);

        System.out.println("Pre-decrement: " + (--number)); 
        System.out.println("Post-decrement: " + (number--));
        System.out.println("After post-decrement, number: " + number);
        System.out.println("Flag: " + flag);
        System.out.println("Logical NOT (!flag): " + (!flag));
    }
}