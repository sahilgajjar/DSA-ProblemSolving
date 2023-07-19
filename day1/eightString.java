import java.util.Scanner;
import java.util.InputMismatchException;

public class eightString{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String inputString = obj.nextLine();

        StringBuilder reversed = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }

        System.out.println(reversed);
    }  
}

