package AccessModifier;


class Animal{

    protected void sound(){
        System.out.println(" Make noice..");
    }
}


class Cat extends Animal{


    public void sound(){
        System.out.println("Meaww..");
    }
}

class Dog extends Animal{

    public void sound(){
        System.out.println("Bark..");
    }
}


public class Access {

    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.sound();









        Animal dog = new Dog();
        dog.sound();

    }

}
