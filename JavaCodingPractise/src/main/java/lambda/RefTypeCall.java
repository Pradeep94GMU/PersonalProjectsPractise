package lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RefTypeCall {

    public static void main(String[] args) {

//        List<String> list = Arrays.asList("Rahul Kumar", "Pradeep", "Sumit", "Nilu");
//
//        //we can use collectionName.forEach
//
//        list.forEach( str -> System.out.println(str) );
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(12);
//        set.add(32);
//        set.add(2);
//        set.add(52);
//        set.add(18);
//        set.add(10);
//        set.add(1);
//
//        set.forEach( str -> System.out.println(str) );

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Rahul");
        map.put(2, "Rahul");
        map.put(3, "Singh Rahul");
        map.put(4, "Pradeep");
        map.put(7, "Radha");
        map.put(9, "Sumit");

        map.forEach( (key, value) -> {
            System.out.println(key+" : "+ value);
            if(key == 3){
                System.out.println("OOOHHKKKK");
            }
        } );

    }

}
