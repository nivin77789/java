import java.util.*;
public class oops {
    public static void main(String args[]) {
        News p1=new News();
        p1.tip=99;
        
System.out.println(p1.color +" colour and the tip is "+ p1.tip);
p1.setColor("green");
p1.settip(7);
System.out.println(p1.color +" colour and the tip is "+ p1.tip);
p1.cat();

    }
    
}
abstract class Pen{
    String color="blue";
    int tip=1;
    void setColor(String newcolor){
        color= newcolor;
    }
    void settip(int newtip){
        tip= newtip;
    }
    abstract void cat();
}
 class News extends Pen{
    void cat(){
        System.out.println("im an extended abstract class");
    }

}