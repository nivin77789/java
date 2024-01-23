public class ArraySearch {

        public static void reverse(int arr[]) {
            int start = 0, end = arr.length - 1;
    
            while (start < end) {
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
                start++;
                end--;
            }
            for(int i=0; i<=arr.length; i++){
                System.out.print(arr[i]+" ");
            }
          
        }
        public static void group(int arr[]){
            for(int i=0; i<arr.length; i++){
    
                for(int j=i+1; j<arr.length; j++){
                    System.out.print(" ("+arr[i]+","+arr[j]+") ");
                }
                    System.out.println();
                }
        }
        public static void subarray(int arr[]){
            int min=arr[0], max=arr[0];
            for(int i=0; i<arr.length; i++){
    
                for(int j=i; j<arr.length; j++){
                    int sum=0;
                    for(int k=i; k<=j; k++){
                        System.out.print(" "+arr[k]);
                        sum+=arr[k];
                    }
if(sum>max){
    max=sum;
}
if(sum<min){
min=sum;
}
                    System.out.print(" sum = "+sum+"  |");
                }
                    System.out.println();
                }
                System.out.println("(  minimum sum = "+min+" maximum sum = "+max+"  )");
        }
        public static void main(String[] args) {
            int arr[] = {1,-2,6,-1,3};
            subarray(arr);
            
    
           
        }
    
    
}
