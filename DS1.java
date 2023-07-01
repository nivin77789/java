import javax.naming.spi.DirStateFactory.Result;
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
System.out.println("Factorial number : ");
        int n=sc.nextInt();
int r=hello(n);
System.out.println("Factorial is : "+r);
    }
}