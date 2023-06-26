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

//day 5
Scanner sc = new Scanner(System.in);
int num; // To hold number
int fact = 1; // To hold factorial
System.out.print("Enter any positive integer: ");
num = sc.nextInt();
for(int i=0; i<=num; i++) {
fact *= i;
}

System.out.println("Factorial: "+ fact);
System.out.println("Factorial is generated Successfully");
    }
}