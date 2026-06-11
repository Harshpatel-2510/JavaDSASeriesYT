import java.util.Scanner;

public class Takinginput {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number:-");
        int firstnumber = sc.nextInt();
        System.out.println("Enter your second number:-");
        int secondnumber = sc.nextInt();
        int Total = firstnumber + secondnumber;
        System.out.println("Your Total is "+Total);

        sc.close();
    }
}
