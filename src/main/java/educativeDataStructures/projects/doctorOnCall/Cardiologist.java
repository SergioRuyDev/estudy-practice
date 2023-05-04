package educativeDataStructures.projects.doctorOnCall;

public class Cardiologist implements Doctor {

    private String name;
    private int age;

    private boolean availability;

    public Cardiologist(String name, int age, boolean availability) {
        this.name = name;
        this.age = age;
        this.availability = availability;
    }

    public Cardiologist() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
