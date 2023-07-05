
import java.util.*;
public class DS1{
    public static void hello(int a , int b ){
        int r=Math.max(a,b);
        System.out.println(r);
    



    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter 2 number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
       hello(a,b);

    }
}