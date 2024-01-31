import java.util.Scanner;

public class MyClass extends Area {
    
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your choice \n1 for circe\n2 for square\n3 for rectangle\n4 for triangle");
      int choice=sc.nextInt();
      Area a=new Area();

      switch (choice) {
        case 1:
          a.circle();
          break;
        case 2:
          a.square();
          break;
        case 3:
          a.rectangle();
          break;
        case 4:
          a.triangle();
          break;  
      
        default:
          System.out.println("Invalid Entry");
          break;
      }
   

    }
        
}
