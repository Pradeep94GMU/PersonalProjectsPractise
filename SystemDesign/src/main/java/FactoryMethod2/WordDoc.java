package FactoryMethod2;

public class WordDoc implements Document{

    @Override
    public void open() {
        System.out.println("Opening the word file.....");
    }

    @Override
    public void save() {
        System.out.println("Saving the modified file.....");
    }
}
