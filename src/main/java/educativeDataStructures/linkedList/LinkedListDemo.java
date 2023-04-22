package educativeDataStructures.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.addLast(3);
        linkedList.addLast(2);
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

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(3));

        linkedList.remove(); //Removes the first element.
        System.out.println("LinkedList after removing first element " + linkedList);

        linkedList.removeLast(); //Removes the last element.
        System.out.println("LinkedList after removing last element " + linkedList);

        linkedList.remove(new Integer(2)); //Removes the first occurrence of 2.
        System.out.println("LinkedList after removing first occurrence of 2. " + linkedList);

        linkedList.removeLastOccurrence(new Integer(2)); //Removes the last occurrence of 4.
        System.out.println("LinkedList after removing the last occurrence of 4. " + linkedList);

        Collections.sort(linkedList);

        System.out.println(linkedList);
    }
}
