package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo6 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,1,2,3,4,5,6,7);


       //reverse
        //swap
        //index
        //for int i = 0 -> n


        IntStream.rangeClosed(0, list.size()/2 - 1).forEach(
                index -> {
                    //swap
                    int temp1 = list.get(index);
                    int temp2 = list.get(list.size()-index - 1);
                    list.set(index, temp2);
                    list.set(list.size()-index - 1, temp1);
                }
        );

        System.out.println(list);


        //find the 2nd smallest : 2

        Integer vaalue = list.stream().sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not found"));


        System.out.println("2nd smllest "+vaalue);


        Optional<Integer> reduce = list.stream()
                .reduce((a, b) -> a + b);

        //check if 4 present or not

        boolean b = list.stream()
                .map(x -> x + "")
                //.filter(str -> str.startsWith("4"))
                .anyMatch( str -> str.startsWith("4"));

        System.out.println(" res: "+ b);


        System.out.println(reduce.get());

        Integer collect = list.stream().filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.summingInt(num -> num));

        System.out.println(collect);
    }

}
