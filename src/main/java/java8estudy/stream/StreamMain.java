package java8estudy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);
//        stream.forEach(p -> System.out.println(p));

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(25);
        list1.add(13);
        list1.add(43);
        list1.add(15);
        list1.add(6);
        list1.add(70);
        list1.add(28);
        list1.add(29);
        list1.add(11);

        list1.stream()                         // Created a stream from the list
                .filter(num -> num > 10)       //filter operation to get only numbers greater than 10
                .forEach(System.out::println); // Printing each number in the list after filtering.

        System.out.println("Original list is not modified");
        list1.stream()
                .forEach(System.out::println);
    }
}
