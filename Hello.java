import java.util.*;
public class Hello {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int i=2; i<=num/2; i++){
if(num%i==0){
    System.out.println("Entered number is Not a Prime number");
    System. exit(0);
    
}
        }

        System.out.println("Entered number is a Prime number");
    }
    
}
