package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;

public class Demo8 {

    public static void main(String[] args) {
        String words = " I am doing Interview at and I am Existed to be part of EY ";

        //find the duplicate words among these
        String[] wordds = words.split(" ");

        HashSet<String> set = new HashSet<>();

        Arrays.stream(wordds).filter(str -> !set.add(str)).forEach(str -> System.out.println(str));


    }

}
