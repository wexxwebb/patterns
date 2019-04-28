package factoryMethod;

import strategy.HttpLoader;
import strategy.Loader;

public class HttpDocumentRestorerImpl extends DocumentRestorer {

    @Override
    Loader createLoader() {
        return new HttpLoader();
    }
}
