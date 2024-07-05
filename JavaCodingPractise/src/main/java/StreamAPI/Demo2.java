package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

    public static void main(String[] args) {


        List<String> list = Arrays.asList(
                "Pradeep", "Rahul", "Pradeep", "Raj", "Pradeep", "Zone" , "Hey", "hey", "Hey"
        );


        System.out.println(list);

        Map<String, Long> listOf = list.stream().collect(
                Collectors.groupingBy(str -> str, Collectors.counting()));



        System.out.println(listOf);

        Stream<Map.Entry<String, Long>> stream = listOf.entrySet().stream();

        System.out.println(stream);


    }

}
