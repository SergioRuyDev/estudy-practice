package java8estudy.slicing;

import java8estudy.comparator.Person;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {

        /**
         * The first operation that we are going to discuss is distinct(). It returns a stream consisting of the distinct
         * elements (according to Object.equals(Object)) of this stream.
         * So, if you have a stream of custom objects then your custom class should override equals() and hashcode() methods.
         * Let’s look at an example to understand distinct() better. In the below example, we have a list of countries.
         * The list can contain duplicate elements as well. We need to print all the distinct countries.
         */

        List<String> countries = new ArrayList<>();
        countries.add("China");
        countries.add("France");
        countries.add("France");
        countries.add("Germany");
        countries.add("Italy");
        countries.add("Italy");
        countries.add("United States");
        countries.add("United Kingdom");

        countries.stream()
                .distinct()
                .limit(3) // Now we will limit the number of countries to three. Stream<T> limit(long maxSize)
                .forEach(System.out::println);

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("New York");
        cities.add("New Jersey");
        cities.add("Liverpool");
        cities.add("Rio de Janeiro");

        cities.stream()
                .distinct()
                .skip(2) //  returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.
                .forEach(System.out::println); // If this stream contains fewer than n elements then an empty stream will be returned

        /**
         * Matching operations are terminal operations that are used to check if elements with certain criteria are present in the stream or not.
         * There are mainly three matching functions available in Stream. These are:
         *
         * anyMatch() - syntax boolean anyMatch(Predicate<? super T> predicate)
         * It takes a predicate as input and returns
         * true if at least one element matches the criteria.
         * false if no element matches the criteria.
         * false if the stream is empty.
         *
         * allMatch() - syntax boolean allMatch(Predicate<? super T> predicate)
         * It takes a predicate as input and returns
         * true if all elements match the criteria.
         * true if the stream is empty.
         * false if even a single element does not match the criteria.
         *
         * noneMatch() - syntax boolean noneMatch(Predicate<? super T> predicate)
         * It takes a predicate as input and returns
         * true if no elements of the stream match the provided predicate.
         * true if the stream is empty.
         * false if even a single element matches the criteria.
         */

        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23, "india"));
        list.add(new Person("Joe", 18,"USA"));
        list.add(new Person("Ryan", 54,"Canada"));
        list.add(new Person("Iyan", 5,"India"));
        list.add(new Person("Ray", 63,"China"));

//        System.out.println("Is any canadian? " + list.stream().anyMatch(p -> p.getCountry().equals("Canada"))); one line solution

        boolean anyCanadian = list.stream()
                                  .anyMatch(p -> p.getCountry().equals("Canada"));

        boolean allCanadians = list.stream()
                                   .allMatch(p -> p.getCountry().equals("Canada"));

        boolean noCanadians = list.stream()
                                  .noneMatch(p -> p.getCountry().equals("Canada"));

        System.out.println("Is no canadians? " + noCanadians);

        System.out.println("Is all canadians? " + allCanadians);

        System.out.println("Is any canadian? " + anyCanadian);
    }
}
