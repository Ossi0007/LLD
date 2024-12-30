package src.main.java.creational.singleton;

public class EagerSingleton {
    //final is only used in eager to make sure it is not initialized again
    private static final EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getSingleton() {
        return singleton;
    }
}
