package FactoryMethod2;

public class PdfCreator extends DocumentFactory{
    @Override
    Document docCreator() {
        return new PdfDoc();
    }
}
