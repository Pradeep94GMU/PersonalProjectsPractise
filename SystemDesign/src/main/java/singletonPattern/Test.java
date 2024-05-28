package singletonPattern;

public class Test { //lazy way to create singleton object
    public static void main(String[] args) {

      Demo d  = Demo.getD();

      System.out.println(d.hashCode());

      Demo d2  = Demo.getD();

      System.out.println(d2.hashCode());
    }
}
