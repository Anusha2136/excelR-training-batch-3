import java.util.Scanner;
public class Demo021 {
    public static String getFizzBizz(int num) {
        if (num <= 0) {
            return "Error";
        }
        if (num % 3 == 0 && num % 5 == 0) {
            return "FIZZBIZZ";
        }
        else if (num % 3 == 0) {
            return "FIZZ";
        }
        else if (num % 5 == 0) {
            return "BIZZ";
        }
        else {
            return Integer.toString(num);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        System.out.println("Result: " + getFizzBizz(input));
        scanner.close();
        }
}