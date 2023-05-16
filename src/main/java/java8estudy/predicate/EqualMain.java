package java8estudy.predicate;

import java.util.function.Predicate;

public class EqualMain {
    public static void main(String[] args) {

        Predicate<String> isEqual = s -> s.equals("Hello");
        Predicate<String> notEqual = s1 -> s1.equals("Welcome");

        boolean isPredicateEqual = isEqual.test("Word");
        boolean isSecondPredicateEqual = notEqual.test("Welcome");
        System.out.println(isPredicateEqual + " " + isSecondPredicateEqual);

        Predicate<String> predicate  = Predicate.isEqual("Hello");

        // The same thing can be achieved by below lambda.
        // Predicate<String> predicate  = p -> p.equals("Hello");

        System.out.println(predicate.test("Welcome"));
    }
}
