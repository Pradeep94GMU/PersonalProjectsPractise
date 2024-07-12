package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {


    public static void main(String[] args) {


        String str = "hello world";

        String[] words = str.split(" ");

       String res = Arrays.stream(words)
                .map(str1-> {
                    StringBuilder sb = new StringBuilder(str1);
                    sb.reverse();
                    return sb.toString();

                }).collect(Collectors.joining(" "));


        System.out.println(res);
    }

}
