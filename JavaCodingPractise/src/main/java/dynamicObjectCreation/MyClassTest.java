package dynamicObjectCreation;

import java.util.function.Supplier;

public class MyClassTest {

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {

         //1st way to create obj

        MyClass myClass = new MyClass(1, "Pradeep");
        //System.out.println(myClass);

        MyClass obj1 = new MyClass();

        //2nd way to create object using cloning
        MyClass obj2 = (MyClass) obj1.clone();
        //System.out.println(obj2);

        //3rd way to create obj using lambda exp
        Supplier<MyClass> supplier = MyClass::new;

        MyClass obj3 = supplier.get();
        System.out.println(obj3);

        //4th is by using reflection dynamically
        MyClass obj4 = (MyClass) Class.forName("dynamicObjectCreation.MyClass").newInstance();
        System.out.println(obj4);



    }

}
