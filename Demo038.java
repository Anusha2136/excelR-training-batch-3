import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        if (Character.isUpperCase(character)) {
            System.out.println("The character is uppercase.");
        } else if (Character.isLowerCase(character)) {
            System.out.println("The character is lowercase.");
        } else {
            System.out.println("The input is not a valid alphabet character.");
        }
        scanner.close();
    }
}
