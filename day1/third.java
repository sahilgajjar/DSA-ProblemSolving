// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
import java.util.InputMismatchException;

public class third {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        float p = 0, r = 0, n = 0;
        
        try {
            System.out.print("Enter principal amount : ");
            p = obj.nextFloat();
            System.out.print("Enter rate of interest : ");
            r = obj.nextFloat();
            System.out.print("Enter time period in year : ");
            n = obj.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("please enter a valid value!");
            return;
        }
        
        float si = p * (r/100) * n;
        System.out.println(si + " is your simple interest");
    }
}
