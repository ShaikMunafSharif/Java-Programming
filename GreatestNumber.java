import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third number: ");
        int c = sc.nextInt();

        if(a>b && a>c) {
            System.out.print(a+ " is greatest number");
        } else if(b>a && b>c) {
            System.out.print(b+ " is greatest number");
        } else {
            System.out.print(c+ " is greater nmumber");
        }
    }
}