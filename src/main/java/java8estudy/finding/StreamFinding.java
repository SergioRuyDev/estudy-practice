package java8estudy.finding;

import java8estudy.comparator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamFinding {
    public static void main(String[] args) {

        /**
         * There are two basic finding operations in streams, i.e., findFirst() and findAny().
         * These operations are typically used with a filter() operation, but it is not necessary that they are used
         * only with a filter() operation.
         *
         * findFirst() - syntax Optional<T> findFirst()
         * It returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty.
         *
         * findAny() - Optional<T> findAny()
         * It returns an Optional describing some element of this stream, or an empty Optional if the stream is empty.
         * just imagine that we can create a parallel stream so that the intermediate operations can be applied in parallel.
         * Now if we use the findFirst() method in the parallel stream, it can be very slow. Instead, findAny() is used if
         * we are not concerned about which element is returned.
         */

        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23,"India"));
        list.add(new Person("Joe", 18,"USA"));
        list.add(new Person("Ryan", 54,"Canada"));
        list.add(new Person("Iyan", 5,"India"));
        list.add(new Person("Ray", 63,"China"));

        Optional<Person> indian = list.stream()
                .filter(p -> p.getCountry().equals("India"))
                .findFirst();
        if (indian.isPresent()) {
            System.out.println(indian.get().getName());
        }

        Optional<Person> person = list.stream()
                .filter(p -> p.getCountry().equals("India"))
                .findAny();

        if (person.isPresent()) {
            System.out.println(person);
        }
    }
}
