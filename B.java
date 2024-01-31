public class B {
    int b;
    public static void main(String ar[]){
        A s=new A();
        A s1=new A();
        s.a=10;
        s1.a=20;
        hell(s1);
    }
   static void hell(A s1){
        System.out.println("the value of a is "+s1.a);
    }
}
