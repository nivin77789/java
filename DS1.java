
import java.util.*;
public class DS1{
    public static void hello(int n){
        int d=0;
        int p=0;
        while(n>0)
        {
            int l=n%2;
          
            d+=l*(int)Math.pow(10,p);
            p++;
            n/=2;
        }

System.out.println("Decimal number is : "+d);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter the binary number : ");
        int n=sc.nextInt();
hello(n);
    }
}