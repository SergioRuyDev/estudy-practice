package java8estudy.comparator;

import java.util.Collections;
import java.util.List;

public class PersonService {

//    public static List<Person> getPersons(List<Person> persons) {
//        Collections.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.getName().compareTo(p2.getName());
//            }
//        });
//        return persons;
//    }


    public static List<Person> getPersons(List<Person> persons) {
        Collections.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        return persons;
    }

}
