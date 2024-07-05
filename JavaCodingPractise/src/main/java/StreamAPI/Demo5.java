package StreamAPI;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Demo5 {

    public static void main(String[] args) {

        IntStream.rangeClosed(0, 10).forEach(x-> System.out.println(x));
    }

}
