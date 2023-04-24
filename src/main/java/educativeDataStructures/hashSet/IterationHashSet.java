package educativeDataStructures.hashSet;

import java.util.*;

public class IterationHashSet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(34);
        set.add(56);

        for (int i : set) {
            System.out.println(i);
        }

        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        set.forEach(System.out::println);

        set.add(32);
        set.add(24);
        set.add(66);

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
