package pl.com.silverstar.java.patterns.singleton;

/**
 *
 * @author sylwester.stocki
 */
public class EarlySingleton {

    private static final EarlySingleton singleton = new EarlySingleton();

    private EarlySingleton() {
        System.out.println("Private constructor of EarlySingleton().");
    }

    public static EarlySingleton getInstance() {
        return singleton;
    }

    public void doSth() {
        System.out.println("EarlySingleton: doSth()");
    }
}
