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
            int max=arr[0];
           
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
                      
                    System.out.print(" sum = "+sum+"  |");
                }
                    System.out.println();
                }
                System.out.println("(  maximum sum = "+max+"  )");

                
        }

        public static void prefix(int arr[]){
            int max=arr[0];
            int sum=0;
            int pr[]=new int[arr.length];
            

            for(int i=1; i<pr.length; i++){
                pr[i]=pr[i-1]+arr[i];
            }
           
            for(int i=0; i<arr.length; i++){
    
                for(int j=i; j<arr.length; j++){
                  
                    sum=i==0 ? pr[j] : pr[j]-pr[i-1];
                        if(sum>max){
                         max=sum;
                        }                
                }
      
                }
                System.out.println("maximum sum = "+max);

                
        }
        public static void main(String[] args) {
            int arr[] = {1,-2,6,-1,3};
            prefix(arr);
            
    
           
        }
    
    
}
