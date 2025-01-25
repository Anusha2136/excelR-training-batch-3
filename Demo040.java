import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is lowercase.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is uppercase.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special character.");
        }
    }
}
