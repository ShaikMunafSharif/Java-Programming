import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter time peroid: ");
        double t = sc.nextDouble();
        System.out.println("Enter the ratio of interest: ");
        double r = sc.nextDouble();

        System.out.println("The Interest is: " +(p*t*r)/100);
    }
}
