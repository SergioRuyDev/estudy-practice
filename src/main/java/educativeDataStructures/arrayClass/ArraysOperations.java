package educativeDataStructures.arrayClass;

import java.util.Arrays;
import java.util.List;

public class ArraysOperations {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Integer[] numbers2 = {1,2,3,4,5,6,7,8,9,10};

        boolean isEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Checking if the arrays are equal: " + isEqual);

        List<Integer> list = Arrays.asList(numbers);

        System.out.println(list);

        Arrays.fill(numbers2, 20);

        for (int i : numbers2) {
            System.out.print(i + " ");
        }
    }
}
