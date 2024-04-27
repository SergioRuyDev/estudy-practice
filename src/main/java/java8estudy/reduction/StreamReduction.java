package java8estudy.reduction;


import java8estudy.reduction.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Introduction to reduction operations
 * Reduction stream operations are those operations that reduce the stream into a single value.
 * The operations that we are going to discuss in this lesson are immutable operations because they
 * reduce the result into a single-valued immutable variable. Given a collection of objects, we may
 * need to get the sum of all the elements, the max element, or any other operation which gives us a
 * single value as a result. This can be achieved through reduction operations.
 *
 * Before we discuss all the reduction operations in detail, let’s first look at some key concepts of
 * reduction:
 * Identity – an element that is the initial value of the reduction operation and the default result if the stream is empty.
 * Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream.
 * Combiner – a function used to combine the partial result of the reduction operation when
 * the reduction is parallelized.
 * or there’s a mismatch between the types of the accumulator arguments and the types of the accumulator implementation.
 *
 * Now, let’s look at some of the reduction methods.
 *
 * 1. Optional<T> reduce(BinaryOperator<T> accumulator)
 * As we can see, this method takes a binary operator as an input and returns an Optional that describes the reduced
 * value.
 * The reduce() method iteratively applies the accumulator function on the current input element.
 * In the below example, we need to find the total salaries of all the employees in an organization.
 * For this, we are going to use the reduce(BinaryOperator<T> accumulator) operation.
 */
public class StreamReduction {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Dave", 23,20000));
        list.add(new Employee("Joe", 18,40000));
        list.add(new Employee("Ryan", 54,100000));
        list.add(new Employee("Iyan", 5,34000));
        list.add(new Employee("Ray", 63,54000));

//        Optional<Integer> totalSalary = list.stream()
//                .map(p -> p.getSalary()) // We are converting the Stream of Employees to Stream of Salaries
//                .reduce((p, q) -> p + q);

        Optional<Integer> totalSalary = list.stream()
                .map(Employee::getSalary) // We are converting the Stream of Employees to Stream of Salaries
                .reduce(Integer::sum);

        if (totalSalary.isPresent()) {
            System.out.println("Total Salary is: " + totalSalary.get());
        }
        /**
         * In the above example, we could have used a sum() operation instead of reduce(), but the sum() operation is
         * available in IntStream.
         * So, if we need to get the sum of all the elements in our stream, we should convert it into IntStream and then
         * directly use sum().
         */

        int sumTotalSalary = list.stream()
                .mapToInt(Employee::getSalary) // p -> p.getSalary()
                .sum();

        System.out.println("Total Salary is: " + sumTotalSalary);

        /**
         * T reduce(T identity, BinaryOperator<T> accumulator)
         * As per Java docs, this method “performs a reduction on the elements of this stream, using the provided identity
         * value and an associative accumulation function, and returns the reduced value.”
         *
         * This method has an extra ‘identity’ parameter. It is the initial value of reduction. It is the default result
         * of reduction if there are no elements in the stream. That’s the reason, this version of the reduce method doesn’t
         * return Optional because it would at least return the identity element.
         *
         * In the below example, we provide five as an identity. If the stream is empty, five will be returned. If the
         * stream is not empty, five will be added to the sum.
         */

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        int totalSum = intList.stream()
                              .reduce(5, Integer::sum); //  .reduce(5, (partialSum, num) -> partialSum + num);

        System.out.println("Total Sum is: " + totalSum);

        int totalParallelSum = intList.parallelStream()
                .reduce(0, Integer::sum, Integer::sum); // .reduce(0, (partialSum, num) -> partialSum + num, Integer::sum);

        System.out.println("Total ParallelSum is: " + totalParallelSum);

        /**
         * max() and min() operations are very helpful if we need to get the largest or smallest element from a stream.
         *
         * Here is the syntax of max() operation
         * Optional<T> max(Comparator<? super T> comparator)
         * It takes a Comparator as a parameter and returns an Optional. Let’s see an example.
         */

        Optional<Integer> max = intList.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Max is: " + max.get());

        Optional<Integer> min = intList.stream()
                .min(Comparator.naturalOrder());

        System.out.println("Min is: " + min.get());
    }
}
