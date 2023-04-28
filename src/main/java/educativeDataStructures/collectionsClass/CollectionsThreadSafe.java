package educativeDataStructures.collectionsClass;

import java.util.*;

public class CollectionsThreadSafe {
    public static void main(String[] args) {

        List<Integer> dest = new ArrayList<>();
        dest.add(10);
        dest.add(20);
        dest.add(30);
        dest.add(40);
        dest.add(50);
        dest.add(60);

        Map<String, Integer> source = new HashMap<>();
        source.put("RJ", 21);
        source.put("SP", 11);
        source.put("MG", 23);
        source.put("PR", 30);

        //Make the Collection thread safe.
//        The Collections class provides us with the following methods that can be used to make our existing collection thread-safe.
//
//      synchronizedCollection(Collection<T> c)
//      synchronizedList(List<T> list)
//      synchronizedMap(Map<K,V> m)
//      synchronizedSet(Set<T> s)
//      synchronizedSortedMap(SortedMap<K,V> m)
//      synchronizedSortedSet(SortedSet<T> s)
        Collections.synchronizedList(dest);
        Collections.synchronizedMap(source);
    }
}
