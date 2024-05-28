package singletonPattern;

public class Test2 {
    public static void main(String[] args) {
      Demo2 d  = Demo2.getD2();

      System.out.println(d.hashCode());

      Demo2 d2  = Demo2.getD2();

      System.out.println(d2.hashCode());
    }
}
