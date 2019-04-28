package factory;

import strategy.DocumentReStorer;
import strategy.Loader;

public class Main {

    private static DocumentReStorer documentReStorer = new DocumentReStorer();

    public static void main(String[] args) {

        String address = "file://c:/Temp/tempFile.txt";

        Loader loader = LoaderFactory.getLoader(address);
        documentReStorer.setLoader(loader);
        documentReStorer.reStore(address);

        address = "http://google.com/tempFile.txt";

        loader = LoaderFactory.getLoader(address);
        documentReStorer.setLoader(loader);
        documentReStorer.reStore(address);
    }
}
