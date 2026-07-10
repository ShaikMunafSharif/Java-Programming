import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("The sum is: " +(a+b));
        System.out.println("The sub is: " +(a-b));
        System.out.println("The mul is: " +(a*b));
        System.out.println("The div is: " +(a/b));
        System.out.println("The mod is: " +(a%b));
    }
}
