package java8estudy.predicate;

import java.util.function.Predicate;

public class AndMain {

    public static void main(String[] args) {

        Person person = new Person("Alex", 23, 15);

        //Created a predicate. It returns true if age is greater thn 18.
        Predicate<Person> greaterThanEighteen = (p) -> p.getAge() > 18;
        //Created a predicate. it returns true if the age is less than sixty
        Predicate<Person> lessThanSixty = (p) -> p.getAge() < 60;

        Predicate<Person> predicate = greaterThanEighteen.and(lessThanSixty);

        boolean eligible = isPersonEligibleForMembership(person, predicate);
        System.out.println("Person is eligible for membership: " + eligible);

    }

    private static boolean isPersonEligibleForMembership(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }
}
