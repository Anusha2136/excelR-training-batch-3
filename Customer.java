import java.util.Scanner;

public class Customer {
    String Cust_Name = "AAnusha";
    long Account_no = 123456;
    double Balance = 10000.00;

    void accept_details() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        Cust_Name = sc.nextLine();

        System.out.print("Enter your account number: ");
        while (!sc.hasNextLong()) {
            System.out.println("Invalid input. Please enter a valid account number:");
            sc.next(); // Clear invalid input
        }
        Account_no = sc.nextLong();

        System.out.print("Enter your balance: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid balance:");
            sc.next(); // Clear invalid input
        }
        Balance = sc.nextDouble();

        sc.close();
    }

    void Display_details() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Hello, " + Cust_Name + "!");
        System.out.println("Your account number is: " + Account_no);
        System.out.println("Your balance is: " + Balance);
    }

    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.accept_details();
        obj.Display_details();
    }
}