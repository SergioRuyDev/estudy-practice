package educativeDataStructures.projects.doctorOnCall;

public interface Doctor {

    public String getName();
    public int getAge();
    public boolean getAvailability();

    public String toString();

    public void setAvalaibility(boolean status);
}
