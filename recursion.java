public class recursion {
    public static void rec(int n){
if(n==0){
    return;
}
 
        System.out.println(n);
        rec(n-1);
   
}
    public static void main(String args[]){
        

rec(9);
    }
}
