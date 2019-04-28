package factoryMethod;



public class Main {

    public static void main(String[] args) {

        DocumentRestorer documentRestorer = new FileDocumentRestorerImpl();
        documentRestorer.restore("file://c:/Temp/tempFile.txt");

        documentRestorer = new HttpDocumentRestorerImpl();
        documentRestorer.restore("http://google.com/tempFile.txt");

    }
}
