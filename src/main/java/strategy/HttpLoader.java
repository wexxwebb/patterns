package strategy;

public class HttpLoader implements Loader {

    @Override
    public void loadFile(String address) {
        System.out.printf("Loading file from ulr %s ...", address);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OK");
    }
}
