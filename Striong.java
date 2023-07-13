import java.util.Scanner;

public class Striong {
    public static void main(String args[]){
        System.out.println("\n\nHello Legend \nEnter your full name :  ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        for(int i=0; i<name.length()/2; i++){
            int n=name.length();
            if(name.charAt(i)!=name.charAt(n-i-1)){
                System.out.println("\n Not a PALANDROM");
            }
        }
  System.out.println("\n WOW its a PALANDROM");
    }
}
