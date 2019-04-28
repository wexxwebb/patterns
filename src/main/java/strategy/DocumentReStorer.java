package strategy;

public class DocumentReStorer {

    private Loader loader;

    public void reStore(String address) {
        loader.loadFile(address);
    }

    public void setLoader(Loader loader) {
        this.loader = loader;
    }
}
