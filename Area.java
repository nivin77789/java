import java.util.Scanner;

public class Area {
     Scanner sc=new Scanner(System.in);
       void circle(){
            double circle,pi=3.14;
            System.out.println("Enter the Radius : ");
            float r=sc.nextFloat();
            circle=pi*r*r;
            System.out.println("The area of the circle is "+circle);
        }
      void  square(){
            double square;
            System.out.println("Enter the area : ");
            float a=sc.nextFloat();
            square=a*a;
            System.out.println("The area of the square is "+square);
        }
       void rectangle() {
            double rec;
            System.out.println("Enter the length and width : ");
            float l=sc.nextFloat();
            float w=sc.nextFloat();
            rec=l*w;;
            System.out.println("The area of the rectangle is "+rec);
        }
       void triangle() {
            double tri;
            System.out.println("Enter the base and height : ");
            float b=sc.nextFloat();
            float h=sc.nextFloat();
            tri=(b*h)/2;
            System.out.println("The area of the triangle is "+tri);
        }
    
}
