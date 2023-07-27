public class recursion {
    public static void rec(int n){
if(n==0){
    return;
}
 
        System.out.println(n+7);
        rec(n-1);
   
}
    public static void main(String args[]){
        

rec(9);
    }
}
