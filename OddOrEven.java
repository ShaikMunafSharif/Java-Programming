import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a%2==0) {
            System.out.print("It is a Even number.");
        } else {
            System.out.print("It is a Odd number");
        }
    }
}
