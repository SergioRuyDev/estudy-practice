package educativeDataStructures.projects.doctorOnCall;

public class Cardiologist implements Doctor {

    private String name;
    private int age;

    private boolean availability;

    public Cardiologist(String name, int age) {
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
        return ("Cardiologist:-\n\tName: "+ name+ "\n\tAge: "+age+"\n\tAvailable:"+availability);
    }

    @Override
    public void setAvalaibility(boolean status) {
        availability = status;
    }
}
