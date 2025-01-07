import java.util.Scanner;

public class Demo009 {
    String custName = "Anusha";
    long accountNo = 123456;
    double balance = 10000.00;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        custName = sc.nextLine();

        System.out.print("Enter your account number: ");
        while (!sc.hasNextLong()) {
            System.out.println("Invalid input. Please enter a valid account number.");
            sc.next();
        }
        accountNo = sc.nextLong();

        System.out.print("Enter your balance: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid balance.");
            sc.next();
        }
        balance = sc.nextDouble();

        sc.close();
    }

    void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Hello, " + custName + "!");
        System.out.println("Your account number is: " + accountNo);
        System.out.println("Your balance is: " + balance);
    }

    public static void main(String[] args) {
        Demo009 obj = new Demo009();
        obj.acceptDetails();
        obj.displayDetails();
    }
}