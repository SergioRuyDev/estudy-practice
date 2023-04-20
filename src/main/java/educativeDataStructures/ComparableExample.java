package educativeDataStructures;

public class ComparableExample {

    public class Employee implements Comparable<Employee> {

        String name;
        int age;

        public Employee(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }


        @Override
        public int compareTo(Employee o) {
            // Using the compareTo() method of String class.
            return this.name.compareTo(o.name);
        }

//        @Override
//        public int compareTo(Employee o) {
//            // We can also use the compareTo() method of the Integer class.
//            return this.age.compareTo(o.age);
//        }

//        @Override
//        public int compareTo(Employee o) {
//            return this.age - o.age;
//        }
    }
}
