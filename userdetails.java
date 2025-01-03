import java.util.Scanner;
public class userdetails{
    public static void main(String[] args){
        String name;
        String password;
        int age;
        System.out.println("Enter the details");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        password = sc.nextLine();
        age = sc.nextInt();
    }
}
