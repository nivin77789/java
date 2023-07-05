
import java.util.*;
public class DS1{
    public static void hello(int a){
        int j=1;
        int b=1;
        for(int k=1; k<=a; k++){
for(int i=1; i<=b; i++){
            System.out.print(j++);


        }
        b++;
   System.out.println();
        }
        



    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter a number : ");
        int a=sc.nextInt();
       hello(a);

    }
}