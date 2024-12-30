package src.main.java.creational.singleton;

public class DoubleLockingSingleton {
    private static DoubleLockingSingleton singleton;

    private DoubleLockingSingleton() {

    }

    public static DoubleLockingSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleLockingSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
