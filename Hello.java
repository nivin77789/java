import java.util.*;
public class Hello {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
        Sample s=new Sample();
s.a=sc.nextInt();
s.b=sc.nextInt();
        System.out.println("Enter your choice \n1 for Addition\n2 for substraction\n3 for multiplication\n4 for division");
int choice=sc.nextInt();
 
    switch(choice){
        case 1:{
            s.result=s.sum(s.a,s.b);
            break;
        }
        case 2:{
            s.result=s.sub(s.a,s.b);
            break;
        }
        case 3:{
            s.result=s.mul(s.a,s.b);
            break;
        }
        case 4:{
            s.result=s.div(s.a,s.b);
            break;
        }
        default :{
            System.out.println("Enter valid choice");
        }
    }
    System.out.println("The Result is "+s.result);
    }
}
