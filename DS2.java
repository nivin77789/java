
import java.util.*;
public class DS2{



    public static void inb(Integer arri[]){
            int n=arri.length;
      Arrays.sort(arri,Collections.reverseOrder());
       System.out.println("Inbuilt sort \n" );
       for(int i=0; i<n; i++){
System.out.print(arri[i]);
     System.out.print("  ");
       }
    }



    public static void main(String args[])
    {

Integer arrc[]={3,6,7,2,1,8,5,9,4,10,11,15,13,14,12};

    
        inb(arrc);
     


    }
}