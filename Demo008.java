import java.util.Scanner;
public class Demo008 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in); 
        String reply; 

        do {
            System.out.println("Welcome to Malla Reddy University");
            System.out.println("Have you visited the site already? (yes/no)");
            reply = Scanner.nextLine(); 

            if (reply.equalsIgnoreCase("no")) { 
                String name = "Keerthi";
                int age = 18;
                long phone = 123456789L; // Use long for phone number
                System.out.println("Hello " + name + ", my age is " + age + ", my phone number is " + phone);
            } else if (!reply.equalsIgnoreCase("yes")) { 
                System.out.println("Invalid input. Please answer with 'yes' or 'no'.");
            }
        } while (!reply.equalsIgnoreCase("yes")); 
        Scanner.close(); 
}
}