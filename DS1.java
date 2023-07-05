
import java.util.*;
public class DS1{
    public static void hello(int a){
        
        for(int k=1; k<=a; k++){
for(int i=1; i<=k; i++){
        System.out.print("*");
   }
   for(int i=1; i<=2*(a-k); i++){
        System.out.print(" ");
   }
   for(int i=1; i<=k; i++){
        System.out.print("*");
   }
   
   System.out.println();
        }
         for(int k=a; k>=1; k--){
for(int i=k; i>=1; i--){
        System.out.print("*");
   }
   for(int i=2*(a-k); i>=1; i--){
        System.out.print(" ");
   }
   for(int i=k; i>=1; i--){
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