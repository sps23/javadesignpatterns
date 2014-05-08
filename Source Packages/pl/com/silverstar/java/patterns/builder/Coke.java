package pl.com.silverstar.java.patterns.builder;

/**
 *
 * @author sylwester.stocki
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public float price() {
        return 4.5f;
    }

}
