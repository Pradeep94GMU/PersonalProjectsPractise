package FactoryMethod2;

public class WordDocCreator extends DocumentFactory{

   public Document docCreator(){

      return new WordDoc();

   }
}
