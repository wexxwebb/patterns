package strategy;

public class Main {

    private static DocumentReStorer documentReStorer = new DocumentReStorer();

    public static void main(String[] args) {

        String address;
        address = "file://C:/Temp/tempFile.txt";

        documentReStorer.setLoader(new FileSystemLoader());
        documentReStorer.reStore(address);

        address = "http://google.com/tempFile.txt";

        documentReStorer.setLoader(new HttpLoader());
        documentReStorer.reStore(address);
    }
}
