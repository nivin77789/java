
import java.util.*;
public class DS1{
    public static void hello(int arr[]){
      System.out.println("enter a number : ");
for(int i=0; i<4; i++){
         System.out.println(arr[i]);
       }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
    
       for(int i=0; i<4; i++){
         arr[i]=sc.nextInt();
       }
hello(arr);
 
    }
}