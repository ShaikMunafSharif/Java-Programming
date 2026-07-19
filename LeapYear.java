import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int n = sc.nextInt();

        if(n%4==0 && n%100 != 0 || n%400==0) {
            System.out.print("It is a Leap Year");
        } else {
            System.out.print("It is not a Leap Year");
        }
    }
}
