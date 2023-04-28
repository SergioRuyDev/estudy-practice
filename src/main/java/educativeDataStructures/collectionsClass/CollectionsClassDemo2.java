package educativeDataStructures.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo2 {
    public static void main(String[] args) {

        List<Integer> dest = new ArrayList<>();
        dest.add(10);
        dest.add(20);
        dest.add(30);
        dest.add(40);
        dest.add(50);
        dest.add(60);

        List<Integer> src = new ArrayList<>();
        src.add(1);
        src.add(2);
        src.add(3);

        Collections.copy(dest, src);
        System.out.println(dest);
        System.out.println(src);

        //filling with default element
        Collections.fill(src, 10);
        System.out.println(src);

        List<String> list = new ArrayList<String>();
        list.add("India");
        list.add("USA");
        list.add("Russia");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        // This will throw exception because element can't be added to unmodifiable list.
        unmodifiableList.add("China");

    }
}
