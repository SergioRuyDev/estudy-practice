package educative.methods;

import java.util.Objects;

//Write a method that checks if a string or character is present in the array. If it’s present, display its index in the
// array. Call your method from the main() method to display the results.

public class SearchStringInArray {
    public static void main(String[] args) {

        String[] strings = {"2", "55", "888", "9", "30", "45"};
        String key = "55";

        findString(strings, key);
    }

    private static void findString(String[] array, String param) {
        int lengthArray = array.length;
        int i = 0;
        int found = 0;
        while (i < lengthArray) {
            if (Objects.equals(array[i], param)) {
                System.out.println(param + " is found at index " + i);
                found = 1;
            }
            i += 1;
        }
        if (found == 0) {
            System.out.println("*** " + param + " is NOT FOUND in the array ***");
        }
    }
}
