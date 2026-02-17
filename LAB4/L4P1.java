import java.util.Scanner;
import java.util.InputMismatchException;
//import java.io.FileNotFoundException;
import java.lang.ArithmeticException;
//import java.lang.Exception;
class L4P1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter two numbers:");
            System.out.println("First number:");
            int x=s.nextInt();
            System.out.println("Second number:");
            int y=s.nextInt();
            int z=x/y;
            System.out.println(z);
        }
        catch(InputMismatchException ime){
            System.out.println(ime.getMessage());
        }
        //catch(FileNotFoundException fme){
           // System.out.println(fme.getMessage());
        //}
        catch(ArithmeticException ame){
            System.out.println(ame.getMessage());
        }
        finally{
            System.out.println("Exception Handled");
        }
    }
}
