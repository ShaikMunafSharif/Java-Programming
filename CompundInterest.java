import java.util.Scanner;
public class CompundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter time peroid: ");
        double t = sc.nextDouble();
        System.out.println("Enter the ratio of interest: ");
        double r = sc.nextDouble();

        double ci = p* Math.pow((1+r/100),t);

        System.out.println("The Interest is: " +ci);
    }
}
