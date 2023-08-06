public class recursion {
    public static int rec(int arr[],int key, int i){
       if(arr[i]==arr.length){
        return -1;
       }
       if(arr[i]==key){
        return i;
       }
return rec(arr,key,i+1);
}
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,9};
        System.out.println(rec(arr,2,0)+1);

    }
}
