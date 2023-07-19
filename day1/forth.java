// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
import java.util.InputMismatchException;

public class forth {
    public static void main(String[] args) {
        float a = 0;
        float b = 0;
        String o = "";
        
        Object[] validatedinput = validateInput(a, b, o);
        
        if(validatedinput != null){
            a = (float) validatedinput[0];
            b = (float) validatedinput[1];
            o = (String) validatedinput[2];
            
            float ans = calculate(a,b,o);
            System.out.println("Your and is " + ans);
            
        } else{
            return;
        }
    }

    public static Object[] validateInput(float a, float b, String o){
        
        Scanner obj = new Scanner(System.in);
            
            try {
                System.out.print("Enter first number : ");
                a = obj.nextFloat();
                System.out.print("Enter second number : ");
                b = obj.nextFloat();
                obj.nextLine();
                System.out.print("Enter operator : ");
                o = obj.nextLine();

                if(o.length() == 1){
                    if(!o.matches("[+-/*]"))
                    {
                        System.out.println("enter a valid operator");
                        return null;
                    }
                } else {
                    System.out.println("enter only one character");
                    return null;
                }
                
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("please enter a valid value!");
                return null;
            }
            return new Object[]{a,b,o};
    }

    public static float calculate(float a, float b, String o){
        o = o.trim();
        System.out.println(o);        
        if(o.equals("+")){
            return (a + b);
        }
        else if(o.equals("-")){
            return (a - b);
        }
        else if(o.equals("*")){
            return (a * b);
        }       
        else {
            return (a / b);
        }
    }
}
