package StreamAPI.IntStream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntSt {

    public static void main(String[] args) {
        
        Integer[] integers = new Integer[]{1,2,3,4,5,6,7};

        Stream<Integer> stream = Arrays.stream(integers);
        
        int[] ints = new int[]{1,2,3,4,5,6};

        Arrays.stream(ints);
    }

}
