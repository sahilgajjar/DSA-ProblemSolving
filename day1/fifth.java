//Take 2 numbers as input and print the largest number.

import java.util.Scanner;
import java.util.InputMismatchException;

public class fifth {
    public static void main(String[] args){
    
        Scanner obj = new Scanner(System.in);
        float a = -1, b = -1; 
        
        try {
            System.out.print("Enter first number : ");
            a = obj.nextFloat();

            System.out.print("Enter second number : ");
            b = obj.nextFloat();
        } catch (InputMismatchException e){
            System.out.println(e);
            return;
        }

        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
