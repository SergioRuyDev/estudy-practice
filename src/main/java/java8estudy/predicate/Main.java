package java8estudy.predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Sergio", 23, 1);
        //Create a predicate. It returns true if age is greater than 18.
        Predicate<Person> predicate = p -> p.getAge() > 18;


        boolean eligible = isPersonEligibleForVoting(person, predicate);

        System.out.println("Person is eligible for voting: " + eligible);
    }

    private static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }


}
