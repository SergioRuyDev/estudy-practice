package java8estudy.predicate;

public class Person {

    private String name;
    private int age;
    private int timeService;

    public Person(String name, int age, int timeService) {
        this.name = name;
        this.age = age;
        this.timeService = timeService;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTimeService() {
        return timeService;
    }
}
