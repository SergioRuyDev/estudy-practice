package educativeDataStructures;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class ArrayListDemo {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(9);
        System.out.println(list.remove(0));

//        list.add(4); // This will add 4 at the end of the List.
//        System.out.println(list);
//
//        list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
//        System.out.println(list);
//
//        List newList = new ArrayList(); // Creating a new List which will be added to original list.
//        newList.add(150);
//        newList.add(160);
//
//        list.addAll(newList); // This will add all the elements present in newList to list.
//        System.out.println(list);
    }
}
