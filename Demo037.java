import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();
        System.out.print("Enter the fourth number: ");
        double number4 = scanner.nextDouble();
        double biggest = number1;
        if (number2 > biggest) biggest = number2;
        if (number3 > biggest) biggest = number3;
        if (number4 > biggest) biggest = number4;
        System.out.println("The biggest number is: " + biggest);
        scanner.close();
    }
}
