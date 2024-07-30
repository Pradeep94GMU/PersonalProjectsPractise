package org.example;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class StringClass {

    public static void main(String[] args) {


        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

        String s1 = null;
        Object s2 = "null";
        if(s1==s2) {
            System.out.println("equal");
        }else {
            System.out.println("Not equal");
        }

        System.out.println(s1.equals(s2));
    }

}
