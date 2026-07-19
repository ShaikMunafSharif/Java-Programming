import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Percentage: ");
        double a = sc.nextDouble();
        if(a>=90) {
            System.out.print("You got A grade.");
        } else if(a>=75 && a<90) {
            System.out.print("You got B grade.");
        } else if(a>=60 && a<75) {
            System.out.print("You got C grade.");
        } else if(a>=30 && a<60) {
            System.out.print("You got D grade.");
        } else {
            System.out.print("You got F grade.");
        }
    }
}
