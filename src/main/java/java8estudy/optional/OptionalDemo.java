package java8estudy.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo {

    Map<Integer, Employee> empMap = new HashMap<>();

    public Optional<Employee> getEmployee(Integer employeeId) {
        //Before returning the employee object we are wrapping it into an Optional
        return Optional.ofNullable(empMap.get(employeeId));
    }

    public static void main(String[] args) {

        OptionalDemo demo = new OptionalDemo();
        Optional<Employee> emp = demo.getEmployee(123);
        // Before getting a value from Optional we check if the value is present through isPresent method
        if (emp.isPresent()) {
            System.out.println(emp.get().getName()); // We use get() method to get the value from Optional.
         } else {
            System.out.println("No employee returned.");
        }
    }
}
