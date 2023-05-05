package educativeDataStructures.projects.doctorOnCall;

public class Dietitian implements Doctor{

    private String name;
    private int age;

    private boolean availability;

    public Dietitian(String name, int age) {
        this.name = name;
        this.age = age;
        availability = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return ("Diettitian:-\n\tName: "+ name+ "\n\tAge: "+age+"\n\tAvailable:"+availability);
    }
}
