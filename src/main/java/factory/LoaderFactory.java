package factory;

import strategy.FileSystemLoader;
import strategy.HttpLoader;
import strategy.Loader;

public class LoaderFactory {

    public static Loader getLoader(String address) {
        if (address.startsWith("file")) {
            return new FileSystemLoader();
        } else if (address.startsWith("http")) {
            return new HttpLoader();
        } else {
            throw new RuntimeException("Unknown protocol");
        }
    }
}
