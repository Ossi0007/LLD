package src.main.java.creational.singleton;

public class SyncSingleton {
    private static SyncSingleton singleton;

    private SyncSingleton() {
    }

    public static synchronized SyncSingleton getSingleton() {
        if (singleton == null) {
            singleton = new SyncSingleton();
        }
        return singleton;
    }
}
