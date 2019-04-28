package singleton.onstart;

import java.util.UUID;

public class OnstartInitSingleton {

    private static OnstartInitSingleton instance = new OnstartInitSingleton();

    private UUID uuid = UUID.randomUUID();

    private OnstartInitSingleton() {

    }

    public static OnstartInitSingleton getInstance() {
        return instance;
    }

    public UUID getUuid() {
        return uuid;
    }
}
