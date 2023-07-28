public class recursion {
    public static int rec(int n){
       
       
if(n==1 | n==0){
    return n;
}
int feb1=rec(n-1);
int feb2=rec(n-2);
int fn= feb1+feb2; 

return fn; 
}
    public static void main(String args[]){
        System.out.println(rec(5));

    }
}
