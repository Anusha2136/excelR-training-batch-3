import java.util.Scanner;
public class Demo017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int firstDigit = number / 10;  
        int secondDigit = number % 10; 
        int sum = firstDigit + secondDigit;
        System.out.println(firstDigit + "+" + secondDigit + "=" + sum);
        scanner.close();
    }

}