import java.util.Scanner;
import java.util.InputMismatchException;

public class second {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your name : ");
        
        String name = "";
        try {
            name = obj.nextLine();
            System.out.println("Hello " + name);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }

        
    } 
}

