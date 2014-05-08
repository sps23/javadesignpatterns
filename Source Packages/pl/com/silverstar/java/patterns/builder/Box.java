package pl.com.silverstar.java.patterns.builder;

/**
 *
 * @author sylwester.stocki
 */
public class Box implements Packing {

    @Override
    public String pack() {
        return this.getClass().getSimpleName();
    }

}
