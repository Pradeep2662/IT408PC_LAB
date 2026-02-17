import java.util.Scanner;
import java.lang.Exception;
class Expect {
    public static void getValue(int x){
        if((x%2 )!=0)
            throw new ArithmeticException(x+" is an Odd number");

        else
            System.out.println(x+" is an even number");
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try{
            int a=s.nextInt();
            getValue(a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
            
       
    }

    
}
