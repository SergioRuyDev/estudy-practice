package java8estudy.functionalInterfaces;

import java8estudy.predicate.Person;

import java.util.function.*;

public class FunctionalMain {
    public static void main(String[] args) {

        //Created a function which returns the length of strings.
        Function<String, Integer> lengthFunction = String::length;
//        Function<String, Integer> lengthFunction = str -> str.length();

        System.out.println("String length: " + lengthFunction.apply("This is awesome!!"));

        //Function which adds 10 to the given element.
        Function<Integer, Integer> increment = x -> x + 10;
        // Function which doubles  the given element.
        Function<Integer, Integer> multiply = y -> y * 10;

        //Since we are using compose(), multiplication will be done first and then increment will be done.
        System.out.println("Compose result: " + increment.compose(multiply).apply(3));

        BiFunction<Integer, Integer, Integer> add = Integer::sum;
//        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("Sum = " + add.apply(2, 3));

        Person person = new Person();
        UnaryOperator<Person> operator = (p) -> {
            p.setName("John");
            p.setAge(34);
            p.setTimeService(10);
            return p;
        };

        operator.apply(person);
        System.out.println("\nPerson name: " + person.getName() + "\nPerson Age: " + person.getAge() +
                "\nPerson Time of Service: " + person.getTimeService());

        //It takes an int as an argument and returns int as a result.
        IntUnaryOperator operator1 = num -> num * num;

        System.out.println(operator1.applyAsInt(25));

        //Both the input objects and the result are of the same type in BinaryOperator<T>.
//        People person1 = new People("Alex", 23);
//        People person2 = new People("Daniel", 56);
//        BinaryOperator<Person> operator2 = (p1, p2) -> {
//            p1.setName(p2.getName());
//            p1.setAge(p2.getAge());
//            return p1;
//        };
//
//        operator.apply(person1, person2);
//        System.out.println("Person Name: " + person1.getName() + " Person Age: " + person1.getAge());
//    }
//}
//
//class People
//{
//    String name;
//    int age;
//
//    People() {
//    }
//
//    People(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
    }
}
