public class oops {
    public static void main(String args[]) {
        pen p1=new pen();
        p1.tip=99;
        
System.out.println(p1.color +" colour and the tip is "+ p1.tip);
p1.setColor("green");
p1.settip(7);
System.out.println(p1.color +" colour and the tip is "+ p1.tip);

    }
    
}
class pen{
    String color="blue";
    int tip=1;
    void setColor(String newcolor){
        color= newcolor;
    }
    void settip(int newtip){
        tip= newtip;
    }
}