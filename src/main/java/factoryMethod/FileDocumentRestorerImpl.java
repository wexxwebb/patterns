package factoryMethod;

import strategy.FileSystemLoader;
import strategy.Loader;

public class FileDocumentRestorerImpl extends DocumentRestorer {

    @Override
    Loader createLoader() {
        return new FileSystemLoader();
    }
}
