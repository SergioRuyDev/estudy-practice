package educativeDataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSort {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);
        list.add(22);

        Collections.sort(list);
        System.out.println("ArrayList in asc order: " + list);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
//        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println("ArrayList in asc order: " + sortedList);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("ArrayList in dsc order: " + list);

        List<Integer> sortedListDsc = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
//                .collect(Collectors.toList());
        System.out.println("ArrayList in dsc order: " + sortedListDsc);
    }
}
