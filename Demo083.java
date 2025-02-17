import java.util.Scanner;
public class Demo083 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.next();
    char ch = str.toLowerCase().charAt(0);
    if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
        System.out.println("Vowel");
    } else {
        System.out.println("Consonant");
    }
    }
}
