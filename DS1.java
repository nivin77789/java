
import java.util.*;
public class DS1{
    public static void hello(int[] arr)
    {
    //   int n=arr.length;
    //   //left max
    //   int leftmax[]=new int[n];
    //   leftmax[0]=arr[0];
    //   for(int i=1; i<n; i++){
    //      leftmax[i]=Math.max(arr[i],leftmax[i-1]);
    //   }
    //   //right max
    //    int rightmax[]=new int[n];
    //   rightmax[n-1]=arr[n-1];
    //   for(int i=n-2; i>=0; i--){
    //      rightmax[i]=Math.max(arr[i] ,rightmax[i+1]);
    //   }

    //   //traped water
    //   int trappedwater=0;
    //   for(int i=0; i<n; i++){
    //      int waterlevel=Math.min(rightmax[i],leftmax[i]);
    //      trappedwater+=waterlevel-arr[i];
    //   }
    // return trappedwater;
int n=arr.length;
int temp=0;
for(int i=0; i<n-1; i++){
  for(int j=0; j<n-1-i; j++){
    if(arr[j]>arr[j+1]){
     temp=arr[j];
     arr[j]=arr[j+1];
     arr[j+1]=temp;
    }
  }
}
   System.out.println("Bubble sort");
  for(int k=0; k<n; k++){
    System.out.print(arr[k]);
     System.out.print("  ");
  }
  System.out.println("");

    }
    public static void sel(int arr[]){
      int n=arr.length;
      for(int i=0; i<n-1; i++){
        int minpos=i;
        for(int j=i+1; j<n; j++){
if( arr[minpos]< arr[j]){
minpos=j;
}
        }
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
      }
      System.out.println("Selection sort");
       for(int i=0; i<n; i++){
System.out.print(arr[i]);
     System.out.print("  ");
       }
    }
    public static void ins(int arr[]){
      int n=arr.length;
    
      for(int i=1; i<n; i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev]> curr){
          arr[prev+1]= arr[prev];
          prev--;
        }
           arr[prev+1]=curr;
      }
           System.out.println("  ");
         System.out.println("Inserton sort");
       for(int i=0; i<n; i++){
System.out.print(arr[i]);
     System.out.print("  ");
       }
          System.out.println("  ");
    }
    public static void main(String args[])
    {
int arr[]={3,6,7,2,1,8,5,9,4,10,11,15,13,14,12};
        hello(arr);
        sel(arr);
        ins(arr);


    }
}