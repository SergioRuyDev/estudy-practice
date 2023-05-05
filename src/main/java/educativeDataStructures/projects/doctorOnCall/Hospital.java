package educativeDataStructures.projects.doctorOnCall;

import java.util.ArrayList;

public class Hospital {

    private String name;
    private ArrayList<Cardiologist> cardiologists;
    private ArrayList<Neurosurgeon> neurosurgeons;
    private ArrayList<Dietitian> dietitians;

    public Hospital(String name) {
        this.name = name;

        cardiologists = new ArrayList<>();
        neurosurgeons = new ArrayList<>();
        dietitians = new ArrayList<>();
    }

    public void addDoctor(String name, int age, String dep) {
        if (dep.equals("cardio")) {
            Cardiologist c = new Cardiologist(name, age);
            cardiologists.add(c);
            return;
        }
        if (dep.equals("neuro")) {
            Neurosurgeon n = new Neurosurgeon(name, age);
            neurosurgeons.add(n);
            return;
        }
        if (dep.equals("diet")) {
            Dietitian d = new Dietitian(name, age);
            dietitians.add(d);
            return;
        }
    }

    public void printPatient( Patient p) {
        System.out.println(p);
    }

    public void printDoctor(Cardiologist c) {
        System.out.println(c);
    }

    public void printDoctor(Neurosurgeon n) {
        System.out.println(n);
    }

    public void printDoctor(Dietitian d) {
        System.out.println(d);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Cardiologist> getCardiologists() {
        return cardiologists;
    }

    public ArrayList<Neurosurgeon> getNeurosurgeons() {
        return neurosurgeons;
    }

    public ArrayList<Dietitian> getDietitians() {
        return dietitians;
    }

    public void bookAppointment(String name, int age, String docType) {
        if (docType.equals("cardiologist")) {
            int rInt = (int) (Math.random() * cardiologists.size());
            System.out.println("Appointment scheduled with " + cardiologists.get(rInt).getName());
            Patient p = new Patient(name, age, Patient.totalPatients+1);
            return;
        }
        if (docType.equals("neurosurgeon")) {
            // Assining doctor
            int rInt = (int)(Math.random() * neurosurgeons.size());
            System.out.println("Appointment scheduled with "+ neurosurgeons.get(rInt).getName());
            Patient p = new Patient(name, age, Patient.totalPatients+1);     // Creating a patient
            return;
        }

        if (docType.equals("dietitian")) {
            // Assining doctor
            int rInt = (int)(Math.random() * dietitians.size());
            System.out.println("Appointment scheduled with "+ dietitians.get(rInt).getName());
            Patient p = new Patient(name, age, Patient.totalPatients+1);     // Creating a patient
            return;
        }
    }

    /* Printing all cardiologists */
    public void printAllCardiologists()
    {
        if(cardiologists.size() != 0)
            for(int i = 0; i < cardiologists.size(); i++)
                printDoctor(cardiologists.get(i));
        else
            System.out.println("No cardiologist hired.");
    }

    /* Printing all neurosurgeons */
    public void printAllNeurosurgeons()
    {
        if(neurosurgeons.size() != 0)
            for(int i = 0; i < neurosurgeons.size(); i++)
                printDoctor(neurosurgeons.get(i));
        else
            System.out.println("No neurosurgeon hired.");
    }

    /* Printing all dietitians */
    public void printAllDietitians()
    {
        if(dietitians.size() != 0)
            for(int i = 0; i < dietitians.size(); i++)
                printDoctor(dietitians.get(i));
        else
            System.out.println("No dietitian hired.");
    }

    /* Send in a patient - overloaded methods */
    public void sendPatient(Cardiologist c)
    {
        if(c.getAvailability() == true)
        {
            System.out.println("It's your turn, please go inside.");
            c.setAvalaibility(false);
        }
        else
        {
            System.out.println("Sorry for the delay. Please wait for your turn.");
        }
    }

    public void sendPatient(Neurosurgeon ne)
    {
        if(ne.getAvailability() == true)
        {
            System.out.println("It's your turn, please go inside.");
            ne.setAvalaibility(false);
        }
        else
        {
            System.out.println("Sorry for the delay. Please wait for your turn.");
        }
    }

    public void sendPatient(Dietitian d)
    {
        if(d.getAvailability() == true)
        {
            System.out.println("It's your turn, please go inside.");
            d.setAvalaibility(false);
        }
        else
        {
            System.out.println("Sorry for the delay. Please wait for your turn.");
        }
    }
}
