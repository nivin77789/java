
import java.util.*;
public class DS1{
    public static void hello(int a ){
        int pal=a;
        int num=0;
        int sum=0;
        
    while(a>0){
num=a%10;
sum+=num;
a=a/10;
    }
   

System.out.println("the sum of the number is : "+sum);


    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter a number : ");
        int a=sc.nextInt();
       hello(a);

    }
}