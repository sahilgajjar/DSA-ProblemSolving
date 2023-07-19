// To find Armstrong Number between two given number.

import java.util.Scanner;
import java.util.InputMismatchException;

public class nine {
    public static void main(String[] args){
    
        Scanner obj = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        
        try{
            System.out.print("Enter the number 1 : ");
            n1 = obj.nextInt();
            System.out.print("Enter the number 2 : ");
            n2 = obj.nextInt();
        } catch( InputMismatchException e ){
            System.out.println(e);
        }

        findArmstrong(n1, n2);
         
    }

    public static void findArmstrong(int n1, int n2){
        for (int i = n1; i <= n2; i++) {
            if (isArmstrong(i)) {
                System.out.println("[ " + i + " ]");
            }
        } 
    }

    public static boolean isArmstrong(int number){
        
        int origionalNumber = number; 
        int digitNumber = String.valueOf(number).length();
        int sum = 0; 
        int digit = 0; 
        
        while( number > 0 ){
            digit = number % 10;
            sum += Math.pow(digit, digitNumber);
            number /= 10;
        }

        return sum == origionalNumber;
    }
}
