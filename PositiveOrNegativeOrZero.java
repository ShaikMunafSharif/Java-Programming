import java.util.Scanner;
public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        int a = sc.nextInt();

        if(a>0) {
            System.out.print("It is a Poitive Integer: ");
        } else if(a<0) {
            System.out.print("It is a negative Integer: ");
        } else {
            System.out.print("It is Zero");
        }
    }
}
