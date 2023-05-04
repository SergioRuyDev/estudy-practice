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

    public Patient() {
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
