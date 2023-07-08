
import java.util.*;
public class DS1{
    public static void hello(int arr[])
    {
     int ts=0;
     int c=0;
     int max=Integer.MIN_VALUE;
     for(int i=0; i<arr.length; i++){
      int start=i;
      for(int j=0; j<arr.length; j++){
         int end=j;
         c=0;
         for(int k=start; k<=end; k++){
            c+=arr[k];
            
         }
        System.out.print(c);
        if(max<c){
         max=c;
        }
         System.out.println();
      }
  
     }
         System.out.println("max="+max);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
int arr[]={2,4,-2,6,1,2,3,31};
         // System.out.println("array before revercing: ");
         // for(int i=0; i<arr.length; i++){
         //    for(int j=0; j<arr.length; j++){
         //       System.out.print("("+arr[i]+","+arr[j]+")  ");
         //    }
       
         // }
       hello(arr);

    }
}