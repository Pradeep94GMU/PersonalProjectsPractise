package StreamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PlayWithHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("hello", 12);
        map.put("New World", 2);
        map.put("hey", 50);
        map.put("himalaya", 10);
        map.put("hindi", 43);

        //find all string starting with "h"

//         List<String> res =map.keySet().stream()
//                .filter(str->str.startsWith("h"))
//                .collect(Collectors.toList());

        //find all sum of values
        int res = map.values().stream()
                .reduce((a, b) -> a + b).get();

        System.out.println(res);

    }

}
