package ComparatorAndComparable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainCompare {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Pradeep Ranjan", 5);
        Person person2 = new Person(2, "Pradeep Raj", 4);

        List<Person> list = Arrays.asList(
                person1,
                person2,
                new Person(12, "Pradeep Ranjan", 125),
                new Person(32, "Rahul ", 15),
                new Person(4, "Sumit", 59),
                new Person(7, "Bhaba", 2)


        );
        System.out.println("Before sorting: ");
        System.out.println(list);

        //check after sorting the collection items
        Collections.sort(list);
        System.out.println("After sorting: ");
        System.out.println(list);

    }

}
