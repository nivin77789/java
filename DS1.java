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
System.out.println("Enter 3 numbers");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int avg= (a+b+c)/3;
System.out.println("the average of two numbers is : "+avg);
    }
}