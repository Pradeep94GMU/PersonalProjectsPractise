package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;

public class DupHashSet {



    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(5);
        set.add(null);
        set.add(null);

        set.equals(set);





        System.out.println(set);

    }

}
