package ComparatorAndComparable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainComparator {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(10, "Pradeep", 68),
                new Employee(16, "Rahul", 32),
                new Employee(1, "Aagy", 17),
                new Employee(19, "Deepak", 32),
                new Employee(16, "Rohan", 32),
                new Employee(1, "Kallu", 17),
                new Employee(19, "Annu", 32)

        );

        System.out.println("Before sorting: \n"+list);

        Collections.sort(list, new SortPersonsbyMultipleFields());

        System.out.println("After sorting: \n"+list);
    }

}
