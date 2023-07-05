
import java.util.*;
public class DS1{
    public static void hello(int a){
        
       for(int i=0; i<=a; i++)
       {
          for(int j=1; j<=a-i; j++)
          {
System.out.print(" ");
          }
          for(int j=1; j<=i*2-1; j++)
          {
             
System.out.print("*");
              

          }
System.out.println();
       }
         for(int i=a; i>=0; i--)
       {
          for(int j=a-i; j>=1; j--)
          {
System.out.print(" ");
          }
          for(int j=i*2-1; j>=1; j--)
          {
             
System.out.print("*");
              

          }
System.out.println();
       }



    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter a number : ");
        int a=sc.nextInt();
       hello(a);

    }
}