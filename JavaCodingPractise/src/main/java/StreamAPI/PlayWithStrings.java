package StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlayWithStrings {

    public static void main(String[] args) {

        String str = "Hello";

        //convert this into stream()
        IntStream res = str.chars();

       //print each char
        //str.chars().map(i -> (char)i).forEach(x-> System.out.println(x));
        //output: 72
        //101
        //108
        //108
        //108
        //111

        //use of mapToObj instead of map()
        //str.chars().mapToObj(i->(char)i).forEach(System.out::println);

        //cal the freq of each char
        Map<Character, Long> res2 = str.chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(res2);

        //cal freq in insertion order maintained/preserve : LinkedHashMap

        Map<Character, Long> res3 =  str.chars().mapToObj(ch-> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(res3);

        //now cal first non-repeating char

        char res5 = str.chars().mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                //till here we have freq map in insertion order
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                //till here we have filtered all the entry with 1 value
                .map(entry-> entry.getKey())
                .findFirst().orElseThrow();

        System.out.println("Non-Repeating char: "+res5);


        //find first repeating char
        char res6 = str.chars().mapToObj(input -> (char)input)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                //remove all the 1 freq
                .entrySet().stream()
                .filter(entry-> entry.getValue() > 1)
                .map(entry-> entry.getKey())
                .findFirst().orElseThrow();

        System.out.println("Repeating char: "+res6);


    }

}
