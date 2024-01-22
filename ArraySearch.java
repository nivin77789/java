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
            for(int i=0; i<arr.length; i++){
    
                for(int j=i; j<arr.length; j++){
                    for(int k=i; k<=j; k++){
                        System.out.print(" "+arr[k]);
                    }
                    System.out.print(" | ");
                }
                    System.out.println();
                }
        }
        public static void main(String[] args) {
            int arr[] = {2,4,6,8,10};
            subarray(arr);
            
    
           
        }
    
    
}
