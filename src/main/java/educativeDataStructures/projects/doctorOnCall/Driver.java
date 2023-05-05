package educativeDataStructures.projects.doctorOnCall;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        Hospital h = new Hospital("Public Care Center");

        h.addDoctor("David", 43, "cardio");
        h.addDoctor("Linda", 31, "cardio");

        h.addDoctor("Mike", 37, "neuro");
        h.addDoctor("Katie", 50, "neuro");

        h.addDoctor("Bob", 29, "diet");
        h.addDoctor("Chris", 41, "diet");

        ArrayList<Cardiologist> cList = h.getCardiologists();
        ArrayList<Neurosurgeon> nList = h.getNeurosurgeons();
        ArrayList<Dietitian> dList = h.getDietitians();

        /* Sending patient to first cardiologist*/
        h.sendPatient(cList.get(0));

        /* Trying sending another patient */
        h.sendPatient(cList.get(0));

        cList.get(0).setAvalaibility(true);
        h.sendPatient(cList.get(0));

        h.bookAppointment("Dave", 21, "neurosurgeon");
        h.bookAppointment("Kim", 19, "cardiologist");
        h.bookAppointment("Sarah", 27, "dietitian");

        h.printAllCardiologists();
        h.printAllDietitians();
        h.printAllNeurosurgeons();

    }
}
