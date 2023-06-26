import javax.naming.spi.DirStateFactory.Result;
import java.util.*;
public class DS1{
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // String c=sc.nextLine();
        // System.out.println(c+"is your name");
        // int a=sc.nextInt();
        // int b=77;
        // int result=a+b;
        // System.out.println(c+"is your name and the result is : "+result);
        //day3
// System.out.println("Enter the cost of pen , pencil and eraser");
// Scanner sc=new Scanner(System.in);
// float a=sc.nextFloat();
// float b=sc.nextFloat();
// float c=sc.nextFloat();
// float sum= a+b+c;
// float total= ((sum/100)*18)+sum;
// System.out.println("the total value of the products is : "+total);
//day4
// double temp=103.5;
// if(temp>100){
//     System.out.println("fever");
// } else {
//     System.out.println("no fever");
// }
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// if (a>0) {
//     System.out.println("positive");
// } else if(a<0) {
//     System.out.println("negative");
// } else {
//     System.out.println("zero");
// }
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// switch(a){
//     case 1 : System.out.println("sun");
//         break;
//     case 2 : System.out.println("mon");
//         break;
//     case 3 : System.out.println("tue");
//         break;
//     case 4 : System.out.println("wed");
//         break;
//     case 5 : System.out.println("thur");
//         break;
//     case 6 : System.out.println("fri");
//         break;
//     case 7 : System.out.println("sat");
//         break;
//     default: System.out.println("zero");    
// }

// Scanner sc = new Scanner(System.in);
// System.out.print("Input the year: ");
// int year = sc.nextInt();
// boolean x = (year % 4) == 0;
// boolean y = (year % 100) != 0;
// boolean z = ((year % 100 == 0) && (year % 400 == 0));
// if (x && (y || z)) {
// System.out.println(year + " is a leap year");
// } else {
// System.out.println(year + " is not a leap year");
// }


Scanner sc=new Scanner(System.in);

int a;
int e=0;
int o=0;
int c;

do{
    System.out.println("Enter a number");
    a=sc.nextInt();
    if(a%2==0){
        e+=a;
    }else{
        o+=a;
    }
    System.out.println("Enter a 0 to stop and 1 to continue");
    c=sc.nextInt();
}while(c==1);


System.out.println("Sum of even number is "+e+ " and the sum of odd number is "+o);



    }
}