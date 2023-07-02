
import java.util.*;
public class DS1{
    public static int hello(int n){
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f*=i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n and r: ");
        int n=sc.nextInt();
        int r=sc.nextInt();
int f=hello(n)/(hello(r)*hello(n-r));
System.out.println("nCr is : "+f);
System.out.println("nCr is : "+n);
    }
}