
import java.util.*;
public class DS1{

  //bubble sort

    public static void hello(int[] arrn)
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



    
int n=arrn.length;
int temp=0;
for(int i=0; i<n-1; i++){
  for(int j=0; j<n-1-i; j++){
    if(arrn[j]>arrn[j+1]){
     temp=arrn[j];
     arrn[j]=arrn[j+1];
     arrn[j+1]=temp;
    }
  }
}
   System.out.println("Bubble sort");
  for(int k=0; k<n; k++){
    System.out.print(arrn[k]);
     System.out.print("  ");
  }
  System.out.println("");

    }



    //selection sort



    public static void sel(int arrb[]){
      int n=arrb.length;
      for(int i=0; i<n-1; i++){
        int minpos=i;
        for(int j=i+1; j<n; j++){
if( arrb[minpos]< arrb[j]){
minpos=j;
}
        }
        int temp=arrb[minpos];
        arrb[minpos]=arrb[i];
        arrb[i]=temp;
      }
      System.out.println("Selection sort");
       for(int i=0; i<n; i++){
System.out.print(arrb[i]);
     System.out.print("  ");
       }
    }



    //insertion sort



    public static void ins(int arrs[]){
      int n=arrs.length;
    
      for(int i=1; i<n; i++){
        int curr=arrs[i];
        int prev=i-1;
        while(prev>=0 && arrs[prev]> curr){
          arrs[prev+1]= arrs[prev];
          prev--;
        }
           arrs[prev+1]=curr;
      }
           System.out.println("  ");
         System.out.println("Inserton sort");
       for(int i=0; i<n; i++){
System.out.print(arrs[i]);
     System.out.print("  ");
       }
          System.out.println("  ");
    }




    //inbuilt sort


    public static void inb(int arri[]){
            int n=arri.length;
      Arrays.sort(arri,0,n);
       System.out.println("Inbuilt sort \n" );
       for(int i=0; i<n; i++){
System.out.print(arri[i]);
     System.out.print("  ");
       }
    }
    public static void main(String args[])
    {
int arr[]={3,6,7,2,1,8,5,9,4,10,11,15,13,14,12};
int arra[]={3,6,7,2,1,8,5,9,4,10,11,15,13,14,12};
int arrb[]={3,6,7,2,1,8,5,9,4,10,11,15,13,14,12};
int arrc[]={3,6,7,2,1,8,5,9,4,10,11,15,13,14,12};

        hello(arr);
        sel(arra);
        ins(arrb);
        inb(arrc);
        


    }
}