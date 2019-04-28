package strategy;

public class FileSystemLoader implements Loader {

    @Override
    public void loadFile(String address) {
        System.out.printf("Loading %s form file system ...", address);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OK");
    }
}
