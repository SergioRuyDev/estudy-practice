package educativeDataStructures.projects.doctorOnCall;

public class Patient {

    private String name;
    private int age;
    private int code;

    public Patient(String name, int age, int code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCode() {
        return code;
    }

    public void printPatient() {
        Patient p = new Patient(name, age, code);
        System.out.println(p);
        return;
    }

    @Override
    public String toString() {
        return ("Patient:-\n\tName: "+ name+ "\n\tAge: "+age);
    }
}
