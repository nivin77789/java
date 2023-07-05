
import java.util.*;
public class DS1{
    public static void hello(int a ){
        int pal=a;
        int num=0;
        int rev=0;
        
    while(a>0){
num=a%10;
rev=rev*10+num;
a=a/10;
    }
    if(pal==rev){
System.out.println("The reverse number is "+rev+ " and its a PALENDROM");
    } else{
        System.out.println("The reverse number is "+rev+ " and its not a PALENDROM");
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