package educativeDataStructures.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);
        list.add(75);
        list.add(75);
        list.add(75);

        System.out.println("The minimum element is the List is: " + Collections.min(list));
        System.out.println("The maximum element is the List is: " + Collections.max(list));
        System.out.println("Total number of time the element 75 is present is the List is: " +
                Collections.frequency(list, 75));

    }
}
