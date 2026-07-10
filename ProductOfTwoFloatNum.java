import java.util.Scanner;
public class ProductOfTwoFloatNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Floating point number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second floating point number: ");
        float b = sc.nextFloat();

        System.out.print("The product of two floating point numbers is: " + (a*b));
    }
}
