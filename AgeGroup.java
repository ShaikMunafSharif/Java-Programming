import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age<13) {
            System.out.print("You are a Child");
        } else if(age<20) {
            System.out.print("You are a Teenager");
        } else if(age<60) {
            System.out.print("You are an Adult");
        } else if(age>=60) {
            System.out.print("You are a senior");
        }
    }
}