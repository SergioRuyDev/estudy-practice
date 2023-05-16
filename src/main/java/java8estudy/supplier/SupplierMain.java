package java8estudy.supplier;

import java8estudy.predicate.Person;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {

        Supplier<Person> supplier = () -> new Person("Alex", 23, 2);
        Predicate<Person> predicate = (p) -> p.getAge() > 18;
        boolean eligible = isPersonEligibleForVoting(supplier, predicate);
        System.out.println("Person is eligible for voting: " + eligible);

        IntSupplier supplier1 = () -> (int) (Math.random() * 10);
        System.out.println(supplier1.getAsInt());

        DoubleSupplier supplier2 = () -> (int) (Math.random() * 10);
        System.out.println(supplier2.getAsDouble());
    }

    private static boolean isPersonEligibleForVoting(Supplier<Person> supplier, Predicate<Person> predicate) {
        return predicate.test(supplier.get());
    }
}
