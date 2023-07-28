public class recursion {
    public static int rec(int n){
       
       
if(n==1){
    return 1;
}
int fn= n+rec(n-1); 

return fn; 
   
}
    public static void main(String args[]){
        System.out.println(rec(5));

    }
}
