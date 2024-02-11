package collections;

import java.util.ArrayList;
import java.util.List;

public class StudyArrayList {
    public static void main(String[] args) {


        List someNumbers = new ArrayList<>(); // non parametrized arrayList and unsafe.

        someNumbers.add(30L);

        List<Long> otherNumbers = new ArrayList<>(); // parametrized arraylist

        otherNumbers.add(1L);
        otherNumbers.add(2L);
        otherNumbers.add(3L);
        otherNumbers.add(4L);
        otherNumbers.add(5L);

        otherNumbers.add(1, 50L);

        System.out.println(otherNumbers);
        System.out.println(otherNumbers.get(1));

        otherNumbers.addAll(someNumbers);
        System.out.println(otherNumbers);
    }
}
