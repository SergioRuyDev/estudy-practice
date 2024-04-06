package collections;

import java.util.ArrayList;
import java.util.Iterator;
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

        System.out.println(someNumbers.size());
        System.out.println(otherNumbers.size());

        otherNumbers.remove(1);
        System.out.println(otherNumbers);

        List<Integer> otherNumbers2 = new ArrayList<>(); // parametrized arraylist

        otherNumbers2.add(1);
        otherNumbers2.add(2);
        otherNumbers2.add(3);
        otherNumbers2.add(4);
        otherNumbers2.add(5);

        System.out.println(otherNumbers2);
        if (otherNumbers2.contains(2)) {
            System.out.println("List contains 2");
        }
        otherNumbers2.set(4, 10); // updating the index 4 (int 5) with element int 10
        System.out.println(otherNumbers2);
        otherNumbers2.clear();


        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");

        fruits.replaceAll(String::toUpperCase);
        System.out.println(fruits);
        System.out.println(fruits.size());

        for (int i = 0; i < fruits.size(); i++) { // simple for loop to iterate by all elements in the array
            System.out.println(fruits.get(i));
        }

        for (String i : fruits) { //Enhanced for loop
            System.out.println(i);
        }

        // Using Iterator
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(10);

        Iterator<Integer> itr = list1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Using forEachRemaining() method
        System.out.println("Iterating using forEachRemaining() method");
        Iterator<Integer> newItr = list1.iterator();
        newItr.forEachRemaining(System.out::println);

        // if element be added to the list after iterator created, a concurrent exception will be throw

    }
}
