//Input currency in rupees and output in USD.
// 1 USD = 82.4 IND ;
import java.util.Scanner;
import java.util.InputMismatchException;

public class six {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        double rate = 82.4;
        double in = -1;
        
        try {
            System.out.print("Enter ind amount : ");
            in = obj.nextFloat();
        } catch(InputMismatchException e){
            System.out.println(e); 
        }
        
        double usd = in / rate;
        System.out.printf("%.2f usd",usd);        
        System.out.println("\n");
    }
}
