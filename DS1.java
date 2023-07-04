
import java.util.*;
public class DS1{
    public static Boolean hello(int a ){
    if(a%2==0){
        return true;
    } else {
        return false;
    }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter a number : ");
        int a=sc.nextInt();
       if(hello(a)){
System.out.println("the number is EVEN");
       } else {
        System.out.println("the number is ODD");
       }


    }
}