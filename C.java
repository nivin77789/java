public class C extends A{
    void onText(String text){
        System.out.println(text);
    }
   C(){
    B b=new B(this);
    b.scan();
   }
    public static void main(String ar[]){
       
        C c=new C();
               
            }
}
