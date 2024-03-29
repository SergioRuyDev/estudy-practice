package java8estudy.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {

        Consumer<String> stringConsumer = System.out::println;
//        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello World!");

        Consumer<Integer> intConsumer = i -> System.out.println("Integer valuer = " + i);
        intConsumer.accept(5);

        //The andThen() method, which is a default method in the Consumer interface is used for chaining.
        // Here is the syntax of this method.
        Consumer<String> consumer1 = (arg) -> System.out.println(arg + "My name is Jane.");
        Consumer<String> consumer2 = (arg) -> System.out.println(arg + "I am from Canada.");

        consumer1.andThen(consumer2).accept("Hello. ");

        BiConsumer<String, String> greet = (s1, s2) -> System.out.println(s1 + s2);
        greet.accept("Hello", "World");
    }
}
