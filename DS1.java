import javax.naming.spi.DirStateFactory.Result;
import java.util.*;
public class DS1{
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // String c=sc.nextLine();
        // System.out.println(c+"is your name");
        // int a=sc.nextInt();
        // int b=77;
        // int result=a+b;
        // System.out.println(c+"is your name and the result is : "+result);
System.out.println("Enter the cost of pen , pencil and eraser");
Scanner sc=new Scanner(System.in);
float a=sc.nextFloat();
float b=sc.nextFloat();
float c=sc.nextFloat();
float sum= a+b+c;
float total= ((sum/100)*18)+sum;
System.out.println("the total value of the products is : "+total);

    }
}