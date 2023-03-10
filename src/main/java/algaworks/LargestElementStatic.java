package algaworks;

public class LargestElementStatic {
    public static void main(String[] args) {

        int[] elements = new int[] { 200, 300, 400, 500 };

        System.out.println(largestElement(elements));
    }

    public static int largestElement(int[] elements) {
        int max = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > max)
                max = elements[i];
        }
        return max;
    }
}
