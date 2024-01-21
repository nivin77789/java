public class array{
    public static int search(int arr[] , int key){
        int start = 0, end = arr.length - 1;
    
        while (start <= end) {
            int mid = (end + start) / 2;

            if (arr[mid] == key) {
                return mid; // Key found
            }

            if (arr[mid] < key) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        return -1; // Key not found
    }
    public static void main(String args[]){
        int arr[]={1,3,5,7,8,9,12,15};
        int key=12;
        int pos=search(arr,key)+1;
        if(pos==-1){
            System.out.println("Key not found");
        } else {
            System.out.println(key+" is there in the position : "+pos);
        }
        
    }
}
