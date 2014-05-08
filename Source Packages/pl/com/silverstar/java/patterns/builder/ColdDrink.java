package pl.com.silverstar.java.patterns.builder;

/**
 *
 * @author sylwester.stocki
 */
public abstract class ColdDrink extends Drink {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
