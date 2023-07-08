
import java.util.*;
public class DS1{
    public static int hello(int arr[], int key)
    {

int s=0;
int e=arr.length;
while(s<=e){
   int mid=(s+e)/2;
   if(arr[mid]==key){
      return mid;
   }
   if(arr[mid]<key){
      s=mid+1;
   } else{
      e=mid-1;
   }
}
return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
int arr[]={6,8,9,12,13,14,15,23};
         System.out.println("enter key element: ");
       int key=sc.nextInt();
int r=hello(arr ,key);
 if(arr[r]==key){
    System.out.println("Key element found at index : "+(r+1));
 } else {
    System.out.println("Key element not found");
 }
    }
}