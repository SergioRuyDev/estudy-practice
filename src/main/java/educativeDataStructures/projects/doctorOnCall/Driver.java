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

        h.printDoctor(cList.get(0));
        h.printDoctor(nList.get(0));
        h.printDoctor(dList.get(0));

    }
}
