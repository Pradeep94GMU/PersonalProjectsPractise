package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDemo2Test {

    public static void main(String[] args) {
        List<StudentDemo2> list = Arrays.asList(

                new StudentDemo2("John", "Doe", 20, "Male", "Computer Science", 2021, "New York", 1),
                new StudentDemo2("Hina", "Rai", 20, "Male", "Computer Science", 2021, "New York", 12),

                new StudentDemo2("Jane", "Doe", 21, "Female", "Electrical Engineering", 2020, "Los Angeles", 2),
                new StudentDemo2("Alice", "Smith", 22, "Female", "Mechanical Engineering", 2019, "Chicago", 3),
                new StudentDemo2("Bob", "Johnson", 23, "Male", "Civil Engineering", 2018, "Houston", 4),
                new StudentDemo2("Charlie", "Brown", 24, "Male", "Chemical Engineering", 2017, "Phoenix", 5),
                new StudentDemo2("David", "Williams", 25, "Male", "Software Engineering", 2016, "Philadelphia", 6),
                new StudentDemo2("Eve", "Davis", 26, "Female", "Biomedical Engineering", 2015, "San Antonio", 7),
                new StudentDemo2("Frank", "Miller", 27, "Male", "Aerospace Engineering", 2014, "San Diego", 8)

        );


        //find students list based on there department
        Map<String, List<StudentDemo2>> res = list.stream()
                .collect(Collectors.groupingBy(StudentDemo2::getDepartmentName));

        for(Map.Entry<String, List<StudentDemo2>> each: res.entrySet()){
            System.out.println(each.getKey()+" : ");
            System.out.println(each.getValue());



        }






    }

    //find list of students with Department wise


}
