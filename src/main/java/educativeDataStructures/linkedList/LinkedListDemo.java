package educativeDataStructures.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.addLast(3);
        System.out.println(linkedList);

        linkedList.addFirst(10);
        System.out.println(linkedList);

        linkedList.add(2, 20);
        System.out.println(linkedList);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);

        linkedList.addAll(0, list);
        System.out.println(linkedList);
    }
}
