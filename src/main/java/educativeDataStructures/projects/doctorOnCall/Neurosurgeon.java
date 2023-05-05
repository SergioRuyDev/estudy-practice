package educativeDataStructures.projects.doctorOnCall;

public class Neurosurgeon implements Doctor{

    private String name;
    private int age;

    private boolean availability;

    public Neurosurgeon(String name, int age) {
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
        return ("Neurosurgeon:-\n\tName: "+ name+ "\n\tAge: "+age+"\n\tAvailable:"+availability);
    }
}
