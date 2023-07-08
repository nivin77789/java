
import java.util.*;
public class DS1{
    public static void hello(int arr[])
    {
     int ts=0;
     for(int i=0; i<arr.length; i++){
      int start=i;
      for(int j=0; j<arr.length; j++){
         int end=j;
         for(int k=start; k<=end; k++){
            System.out.print(arr[k]+"  ");
         }
         ts++;
         System.out.println();
      }
      System.out.println();
     }
     System.out.println("total : "+ts);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
int arr[]={2,4,6,8,10};
         // System.out.println("array before revercing: ");
         // for(int i=0; i<arr.length; i++){
         //    for(int j=0; j<arr.length; j++){
         //       System.out.print("("+arr[i]+","+arr[j]+")  ");
         //    }
         //    System.out.println();
         // }
       hello(arr);

    }
}