package pl.com.silverstar.java.patterns.builder;

/**
 *
 * @author sylwester.stocki
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return this.getClass().getSimpleName();
    }

}
