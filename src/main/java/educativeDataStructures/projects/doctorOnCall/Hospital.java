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
}
