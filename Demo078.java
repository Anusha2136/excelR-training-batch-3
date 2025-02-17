import java.util.Scanner;

class Demo078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the range (N): ");
        int n = sc.nextInt();
        
        System.out.println("\nEven Numbers\tOdd Numbers");
        System.out.println("numbers");

        int even = 2, odd = 1;
        while (even <= n || odd <= n) {
            String evenStr = (even <= n) ? even + "\t\t" : "\t\t";
            String oddStr = (odd <= n) ? String.valueOf(odd) : "";
            System.out.println(evenStr + oddStr);
            
            even += 2;
            odd += 2;
        }
        
        sc.close();
    }
}
