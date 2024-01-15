import java.util.*;
public class array {
    public static int update(int marks[]){
        int largest=Integer.MIN_VALUE;
         for(int i=0; i<marks.length; i++){
           if(largest<marks[i]){
            largest=marks[i];
           }
        }
        return largest;

    }
    public static void main(String args[]){
       int marks[]={99191,2,34,435,56,23,34546,546,546,3223,23};
       int largest=update(marks);
       System.err.println("largest=  "+largest);

    }
    
}
