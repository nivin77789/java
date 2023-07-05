
import java.util.*;
public class DS1{
    public static void hello(int a ,int b){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i==1 || i==a | j==1 | j==b){
                    System.out.print("*");
                }else{
System.out.print(" ");
                }
                
            }

System.out.println();
        }
   



    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter a number : ");
        int a=sc.nextInt();
            int b=sc.nextInt();
       hello(a,b);1

    }
}