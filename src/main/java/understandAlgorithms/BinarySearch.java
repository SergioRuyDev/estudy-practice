package understandAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(binarySearch(arr, 3)); // expected 2 (position 2)
        System.out.println(binarySearch(arr, -1)); // expected -1



    }

    // Binary Search is Log 2 N, logaritm time
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == target) {
                return mid;
            }
            if (guess > target) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
