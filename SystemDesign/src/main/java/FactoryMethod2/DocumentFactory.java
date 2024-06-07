package FactoryMethod2;

public abstract class DocumentFactory {

    //we need to create obj using subclass
    abstract Document docCreator();

    public void getWorkDone(){
        Document doc = docCreator(); //this method will create my obj
        doc.save();
        doc.open();
    }


}
