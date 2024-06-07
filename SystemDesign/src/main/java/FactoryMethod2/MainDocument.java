package FactoryMethod2;

public class MainDocument {

    public static void main(String[] args) {
       DocumentFactory docWord = new WordDocCreator();
       docWord.getWorkDone();

        DocumentFactory docPDF = new PdfCreator();
        docPDF.getWorkDone();
    }


}
