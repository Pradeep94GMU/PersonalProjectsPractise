package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(6,2),
                Arrays.asList(9,11),
                Arrays.asList(30,31),
                Arrays.asList(5,8)
        );

        //use flatmap
        List<Integer> singleList1 = list.stream().flatMap(eachEnrty -> eachEnrty.stream()).collect(Collectors.toList());
        List<Integer> singleList2 = list.stream().flatMap(eachEnrty -> eachEnrty.stream().map(eachflattedEnrty->eachflattedEnrty+20)).collect(Collectors.toList());
        List<Integer> singleList3 = list.stream().flatMap(eachEnrty -> eachEnrty.stream().map(eachflattedEnrty->eachflattedEnrty+20).filter(eachflattedEnrty-> eachflattedEnrty % 2== 0)).collect(Collectors.toList());
        List<Integer> singleList4 = list.stream().flatMap(eachEnrty -> eachEnrty.stream()).map(eachflattedEnrty->eachflattedEnrty+20).filter(eachflattedEnrty-> eachflattedEnrty % 2== 0).collect(Collectors.toList());

        //list.stream().flatMap(eachEnrty -> eachEnrty.stream()).forEach(System.out::println);

//        System.out.println(singleList1);
//        System.out.println(singleList2);
//        System.out.println(singleList3);
//        System.out.println(singleList4);


        singleList4.stream().sorted((a, b)-> b - a).forEach(x-> System.out.println(x));
       // singleList4.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        Optional<Integer> res = singleList4.stream().min(
                (a, b)->
        {
            return Integer.compare(a,b);
        });

        System.out.println(res.get());

        Stream stream = list.stream();
        System.out.println(stream.peek(x-> System.out.println(x)));


    }

}
