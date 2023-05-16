package java8estudy.predicate;

public class Person {

    private String name;
    private int age;
    private int timeService;

    public Person() {
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTimeService(int timeService) {
        this.timeService = timeService;
    }
}
