package educativeDataStructures.arraylistExercise;

import java.util.*;


//Problem 1: Find employees aged over 50
//All the employee names whose age is more than 50.
//
//Problem 2: Find employees from the USA
//Remove all the Employees from the List who reside in the USA.
//
//Problem 3: Sort employees by country
//Sort all the employees by country name.

public class ArrayListExercise {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        System.out.println("Sorting by names with age more than 50 years.");
        for (Employee employee : list) {
            if (employee.age > 50) {
                System.out.println("Employee name " + employee.name + " Employee age " + employee.age +
                        " Employee country name " + employee.country);
            }
        }
        //Solution using streams.
        System.out.println("Solution using streams");
        list.stream().filter(emp -> emp.age > 50).map(emp -> emp.name).forEach(System.out::println);

        // Solution with Iterator
        System.out.println("Removing the employees residing in USA from the List");
        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext()) {
            if(itr.next().country.equals("USA")) {
                itr.remove();
            }
        }

        System.out.println("List without Employees from USA.");
        Collections.sort(list, ((o1, o2) -> o1.country.compareTo(o2.country)));
        list.remove(list.get(5));
        list.remove(list.get(4));
        for (Employee employee : list) {
            System.out.println("Employee name " + employee.name + " Employee age " + employee.age +
                    " Employee country name " + employee.country);
        }


        System.out.println("Sorting by country name.");
        Collections.sort(list, ((o1, o2) -> o1.country.compareTo(o2.country)));
        for (Employee employee : list) {
            System.out.println("Employee name " + employee.name + " Employee age " + employee.age +
                    " Employee country name " + employee.country);
        }
    }
}
