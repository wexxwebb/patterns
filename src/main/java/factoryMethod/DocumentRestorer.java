package factoryMethod;

import strategy.Loader;

abstract class DocumentRestorer {

    void restore(String address) {
        Loader loader = createLoader();
        loader.loadFile(address);
    }

    abstract Loader createLoader();
}
