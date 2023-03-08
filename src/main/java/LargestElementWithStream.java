import java.util.Arrays;

public class LargestElementWithStream {
    public static void main(String[] args) {

        int arr[] = {10, 324, 45, 90, 9808};
//        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Largest in given array is " + largestElement(arr));
    }
    public static int largestElement(int[] elements) {
        int max = Arrays.stream(elements).max().getAsInt();
        return max;
    }
}


