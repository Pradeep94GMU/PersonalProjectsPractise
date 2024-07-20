package StreamAPI;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayWithNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,-2,-3,4,-5,6,-7,3,2,2,2,4,4,4,2);







        //find which number has max repeated times == freq map == groupingBy

        Map<Integer, Long> res = list.stream().collect(Collectors.groupingBy( Function.identity(), Collectors.counting()));
        System.out.println(res);
        Map.Entry<Integer, Long> ress = res.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

        System.out.println(ress);

//        list.stream().limit(100).forEach(System.out::println);
//
//        //sort the list
//        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);
//
//        //sort based on absolute value || This changes the value,
//        List<Integer> collect1 = list.stream().map(num -> Math.abs(num)).sorted().collect(Collectors.toList());
//        System.out.println(collect1);
//
//        //sort based on absolute value
//        List<Integer> collect2 = list.stream().sorted(Comparator.comparingInt(Math::abs)).collect(Collectors.toList());
//        System.out.println(collect2);
    }

}
