package StreamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmployeeByCity {

    public SortEmployeeByCity() {
    }

    public static void main(String[] args) {
        Map<Integer, EmployeeDto> map = new HashMap<>();
        map.put(1, new EmployeeDto(1, "Abc", "Mumbai"));
        map.put(2, new EmployeeDto(2, "Pqr", "Bangalore"));
        map.put(3, new EmployeeDto(3, "Xyz", "Delhi"));
        map.put(4, new EmployeeDto(4, "Mnp", "Pune"));

        // Print the original map
        System.out.println("Original Map:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        //as we have to sort the maap , we have many differen steps
        //convert the map and take entrySet to stream
       Map<Integer, EmployeeDto> each =  map.entrySet().stream()
                //now sort this stream
                .sorted(
                        //as we are dealing with maps, we have to use eaach entry

                        Map.Entry.comparingByValue(
                                //but as value multiple element( 1D then we can use Comparator
                                Comparator.comparing(EmployeeDto::getCity)
                        )
                ).collect(Collectors.toMap(
                        //4 things after sorting map dataa
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2)->e1,
                        LinkedHashMap::new
                ));

        System.out.println(each);
        each.forEach((key, value)-> System.out.println(key+" "+value));
    }

}
