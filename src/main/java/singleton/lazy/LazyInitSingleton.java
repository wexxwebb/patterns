package singleton.lazy;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class LazyInitSingleton {

    private static LazyInitSingleton instance = null;

    private UUID uuid = UUID.randomUUID();

    private LazyInitSingleton() {

    }

    public static synchronized LazyInitSingleton getInstance() {
        if (instance == null) {
            init();
        }
        return instance;
    }

    private static synchronized void init() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
    }

    public UUID getUuid() {
        return uuid;
    }


}
