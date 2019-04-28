package singleton.onstartenum;

import java.util.UUID;

public enum Singleton {

    SINGLETON;

    private UUID uuid = UUID.randomUUID();

    public UUID getUuid() {
        return uuid;
    }
}
