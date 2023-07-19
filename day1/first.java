import java.util.Scanner;
import java.util.InputMismatchException;

public class first {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in); 
        System.out.print("Enter a numebr : "); 
        int n = -1;
        
        try {
            n = obj.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
            return;
        } 
        
        if(isEven(n)){
            System.out.println("number is even"); 
        }
        else {
            System.out.println("number is odd");
        }
    }

    public static boolean isEven(int n){
        return (n%2 == 0);
    }
}
