import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Height of a triangle: ");
        double h = sc.nextDouble();
        System.out.print("Enter Breath of a triangle: ");
        double b = sc.nextDouble();
        
        double area = 0.5*h*b;
        System.out.print("The area of a triangle is: " +area);
    }
}
