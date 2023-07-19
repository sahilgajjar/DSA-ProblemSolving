import java.util.Scanner;
import java.util.InputMismatchException;

public class eight {
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = obj.nextInt();

        int reversed = reverseNumber(number);

        if(reversed == number){
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static int reverseNumber(int number){
        
        int reversed = 0;
        int digit;
        
        while(number != 0) {
            digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }
}
