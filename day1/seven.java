import java.util.Scanner;
import java.util.InputMismatchException;

public class seven{
    
    public static void main(String[] args){
        
        int n = 10;
        fibonacci(n);
    }

    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int temp; 
        System.out.println(a); 
        
        for (int i = 0; i < n; i++) {
            System.out.println(b);
            temp = b; 
            b = b + a;
            a = temp;
        }
    }
    
}
