
import java.util.*;
public class DS1{
    public static int hello(int a , int b , int c){
    return ((a+b+c)/3);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter three number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

System.out.println("the average of three number is "+hello(a,b,c));
    }
}