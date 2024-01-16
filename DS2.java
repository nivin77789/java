import java.util.*;
public class DS2 {
    public static int update(int marks[], int key){
        int start=0, end=marks.length-1;
        while(start <= end){
            int mid=(start+end)/2;
            if(marks[mid]== key){
                return mid;
            }
            if(marks[mid] < key){
                start=mid+1;

            } else {
                end=mid-1;
            }
        }
       
        return -1;

    }
    public static void main(String args[]){
       int marks[]={5,4,3,2,1};
       int key=2;
     
        System.out.println("position =  "+update(marks,key));
    
      

    }
    
}
