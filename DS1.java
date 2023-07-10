
import java.util.*;
public class DS1{
    public static int hello(int[] arr)
    {
   //    int n=arr.length;
   //    //left max
   //    int leftmax[]=new int[n];
   //    leftmax[0]=arr[0];
   //    for(int i=1; i<n; i++){
   //       leftmax[i]=Math.max(arr[i],leftmax[i-1]);
   //    }
   //    //right max
   //     int rightmax[]=new int[n];
   //    rightmax[n-1]=arr[n-1];
   //    for(int i=n-2; i>=0; i--){
   //       rightmax[i]=Math.max(arr[i] ,rightmax[i+1]);
   //    }

   //    //traped water
   //    int trappedwater=0;
   //    for(int i=0; i<n; i++){
   //       int waterlevel=Math.max(rightmax[i],leftmax[i]);
   //       trappedwater+=waterlevel-arr[i];
   //    }
   //  return trappedwater;

    int res = 0;
    int n=arr.length;

 if (n == 0) {
   return 0;
 }
 int[] leftMax = new int[n];

 int[] rightMax = new int[n];

 leftMax[0] = arr[0];

 for (int i = 1; i < leftMax.length; i++) {
   leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
 }

 rightMax[n - 1] = arr[n- 1];

 for (int j = rightMax.length - 2; j >= 0; j--) {
   rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
 }
 for (int x = 0; x < n; x++) {
   res += Math.min(leftMax[x], rightMax[x]) - arr[x];
 }
 return res;
    }
    public static void main(String args[])
    {
int arr[]={0 , 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
         System.out.println(hello(arr));

    }
}