import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int t = a;
        a = b;
        b = t;
        System.out.println("The Swapping of a and b is : " + a + " and " + b );
    }
}
