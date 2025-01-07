import java.util.Scanner;
public class Demo007 {
    public static void main(String[] args) {
       String name;
       int age;
       int phno;
       System.out.println("enter name,age,phone number");
       Scanner sc = new Scanner(System.in);
       name = sc.nextLine();
       age = sc.nextInt();
       phno = sc.nextInt();
       System.out.println("Hello" + name + "age is" + age + "my phone number" + phno);  
    } 
}