public class array{
    public static int binarySearch(int marks[], int key) {
        int start = 0, end = marks.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (marks[mid] == key) {
                return mid;
            }
            if (marks[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 8;

        System.out.println("Position = " + binarySearch(marks, key));
    }
}
