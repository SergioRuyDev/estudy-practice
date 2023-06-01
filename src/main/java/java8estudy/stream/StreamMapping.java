package java8estudy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapping {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Ryan");
        list.add("Sergio");
        list.add("Ruy");
        list.add("Julia");
        list.add("Andressa");

        list.stream()
//                .map(name -> name.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);

        list.stream()
                .mapToInt(String::length)
                .forEach(System.out::println);


        List<List<String>> stringList = new ArrayList<>();
        stringList.add(Arrays.asList("a","b","c"));
        stringList.add(Arrays.asList("d","e","f"));
        stringList.add(Arrays.asList("g","h","i"));
        stringList.add(Arrays.asList("j","k","l"));

        //Created a stream from the list
        Stream<List<String>> stream1 = stringList.stream();
        // Flattened the stream.
//        Stream<String> stream2 = stream1.flatMap(s -> s.stream());
        Stream<String> stream2 = stream1.flatMap(Collection::stream);
        //Applied filter on flattened stream.
//        Stream<String> stream3 = stream2.filter(x -> "a".equals(x));
        Stream<String> stream3 = stream2.filter("a"::equals);

        stream3.forEach(System.out::println);

        // All the code above can be written like this
        stringList.stream()
                .flatMap(Collection::stream)
                .filter("a"::equals)
                .forEach(System.out::println);
    }
}
