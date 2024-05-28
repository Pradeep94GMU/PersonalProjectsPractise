package singletonPattern;

public class Demo2 {

   private static  Demo2 d = new Demo2();

   private Demo2(){

   }

   public static Demo2 getD2(){
     return d;
   }
}
