package pl.com.silverstar.java.patterns.singleton;

/**
 *
 * @author sylwester.stocki
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
        System.out.println("Private constructor of LazySingleton().");
    }

    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (singleton == null) {
                System.out.println("LazySingleton: getInstance() invoked for the first time.");
                singleton = new LazySingleton();
            }
        }
        return singleton;
    }

    public void doSth() {
        System.out.println("LazySingleton: doSth()");
    }
}
