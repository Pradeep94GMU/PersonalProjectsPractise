package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Pradeep", "Rahul", "Pradeep", "Raj", "Pradeep", "Zone" , "Hey", "hey", "Hey"
        );

        //i need to sort this list

        //List<String> collect = list.stream().sorted().collect(Collectors.toList());

        //System.out.println(collect);

        Map<String, Long> collect = list.stream().collect(
                Collectors.groupingBy(str -> str, Collectors.counting())
        );

        System.out.println(collect);

        //sort this map based on value
        Map<String, Long> collect1 = collect.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2)-> e1,
                        LinkedHashMap::new
                ));

        System.out.println(collect1);
    }

}
