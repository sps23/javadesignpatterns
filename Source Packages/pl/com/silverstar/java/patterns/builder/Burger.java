package pl.com.silverstar.java.patterns.builder;

/**
 *
 * @author sylwester.stocki
 */
public abstract class Burger extends Food {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
