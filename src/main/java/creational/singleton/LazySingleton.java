package src.main.java.creational.singleton;

public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
