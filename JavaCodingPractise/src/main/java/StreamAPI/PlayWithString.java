package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class PlayWithString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "World", "Pradeep", "Rahul", "Hi", "New");





        //sort the strings based on length
        //read the string and for each string, transfer into length
        //collect and save

        /*List<Integer> res = list.stream()
                .map(str -> str.length())
                .sorted((a, b)-> b - a) //Collectors.reverseOrder() or //Collections.reverseOrder()
                .collect(Collectors.toList());
        System.out.println(res);
*/
        //question 2: print the string itself not the length
        List<String> collect = list.stream()
                .sorted(Comparator.comparing(str->str.length())).collect(Collectors.toList());

        System.out.println(collect);

    }

}
