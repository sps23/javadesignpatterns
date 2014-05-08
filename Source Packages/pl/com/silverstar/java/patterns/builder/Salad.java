package pl.com.silverstar.java.patterns.builder;

/**
 *
 * @author sylwester.stocki
 */
public abstract class Salad extends Food {

    @Override
    public Packing packing() {
        return new Box();
    }

}
