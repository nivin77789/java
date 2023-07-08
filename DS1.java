
import java.util.*;
public class DS1{
    public static void hello(int arr[])
    {
      int newarr[]=new int[arr.length];
      int len=7;
for(int i=0; i<7; i++){
            newarr[i]=arr[len];
            len--;
         }
           System.out.println("array after revercing: ");
         for(int i=0; i<arr.length; i++){
             System.out.println(newarr[i]);
         }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
int arr[]={6,8,9,12,13,14,15,23};
         System.out.println("array before revercing: ");
         for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
               System.out.print("(");
                  System.out.print(arr[i]);
                  System.out.print(",");
                     System.out.print(arr[j]);
                     System.out.print(")   ");
            }
            System.out.println();
         }
       hello(arr);

    }
}