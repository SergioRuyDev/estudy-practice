package java8estudy.predicate;

import java.util.function.BiPredicate;

public class BiPredicateMain {
    public static void main(String[] args) {


        Person person = new Person("Ruy", 41, 15);

        boolean eligible = isPersonEligibleForVotint(
                person,
                18,
                (p, minAge) -> {
                    return p.getAge() > minAge;
                });
        System.out.println("Person is eligible for voting: " + eligible);
    }

    private static boolean isPersonEligibleForVotint(
            Person person, int minAge, BiPredicate<Person, Integer> predicate) {
        return predicate.test(person, minAge);
    }
}
