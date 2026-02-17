import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
//import java.io.FileNotFoundException;
import java.lang.ArithmeticException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.lang.Exception;
class L4P1{
    public static void main(String[] args) throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader s=new BufferedReader(isr);
        //try{
            System.out.println("Enter two numbers:");
            System.out.println("First number:");
            int x=Integer.parseInt(s.readLine());
            System.out.println("Second number:");
            int y=Integer.parseInt(s.readLine());
            int z=x/y;
            System.out.println(z);
       // }
        /**catch(InputMismatchException ime){
            System.out.println(ime.getMessage());
        }
        //catch(FileNotFoundException fme){
           // System.out.println(fme.getMessage());
        //}
        catch(ArithmeticException ame){
            System.out.println(ame.Class());
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        finally{
            System.out.println("Exception Handled");
            */
     }
}