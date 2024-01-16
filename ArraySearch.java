public class ArraySearch {

        public static int binarySearch(int arr[], int key) {
            int start = 0, end = arr.length - 1;
    
            while (start <= end) {
                int mid = start + (end - start) / 2;
    
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
    
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int key = 5;
    
            int result = binarySearch(arr, key);
    
            if (result != -1) {
                System.out.println("Element found at index " + result);
            } else {
                System.out.println("Element not found in the array");
            }
        }
    
    
}
