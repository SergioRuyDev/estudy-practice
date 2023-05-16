package java8estudy.predicate;

import java.util.function.Predicate;

public class OrMain {

    public static void main(String[] args) {

        Person person = new Person("Ana", 55, 32);
        // Created a predicate. It returns true if age is greater than 60.
        Predicate<Person> personAge = p -> p.getAge() > 60;
        // Created a predicate. It returns true if year of service is greater than 30.
        Predicate<Person> personService = p -> p.getTimeService() > 30;

        Predicate<Person> predicate = personAge.or(personService);

        boolean retirement = isPersonCanRetire(person, predicate);
        System.out.println("Person is eligible for retire: " + retirement);
    }

    private static boolean isPersonCanRetire(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }
}
