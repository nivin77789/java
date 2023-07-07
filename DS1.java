
import java.util.*;
public class DS1{
    public static void hello(int arr[], int key)
    {

for(int i=0; i<4; i++)
{
   if(arr[i]==key){
               System.out.println("Element found at index "+i);
            
   } 
}  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
    
       for(int i=0; i<4; i++){
         arr[i]=sc.nextInt();
       }
         System.out.println("enter a number : ");
       int key=sc.nextInt();
hello(arr ,key);
 
    }
}