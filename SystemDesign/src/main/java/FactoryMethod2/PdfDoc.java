package FactoryMethod2;

import javax.print.Doc;

public class PdfDoc implements Document {

    @Override
    public void open() {
        System.out.println("Opening the PDF file.....");
    }

    @Override
    public void save() {
        System.out.println("Saving the modified PDF file.....");
    }

}
