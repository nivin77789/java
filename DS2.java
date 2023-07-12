
import java.util.*;
public class DS2{



    public static void inb(int arr[][]){
            int r=arr.length-1;
            int c=arr[0].length-1;
            int rstart=0;
            int cstart=0;

      while(rstart<=r && cstart<=c) {
                for(int i=cstart; i<=c; i++){
                    System.out.print(arr[rstart][i]+"  ");
                }
              
               for(int i=rstart+1; i<=r; i++){
                    System.out.print(arr[i][c]+"  ");
                }
            for(int i=c-1; i>=cstart; i--){
                    System.out.print(arr[r][i]+"  ");
                }
                for(int i=r-1; i>=rstart+1; i--){
                     System.out.print(arr[i][cstart]+"  ");
                }
           r--;
           c--;
           rstart++;
           cstart++;
            }

    }



    public static void main(String args[])
    {

int arrc[][]={{1,2,3,4,5},
              {5,6,7,8,2},
              {2,3,4,5,1},
              {2,3,4,5,1},
              {9,3,2,1,0}};

    
        inb(arrc);
     


    }
}