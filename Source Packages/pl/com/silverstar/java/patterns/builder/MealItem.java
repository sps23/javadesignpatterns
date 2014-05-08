package pl.com.silverstar.java.patterns.builder;

/**
 *
 * @author sylwester.stocki
 */
public interface MealItem {

    public String name();

    public Packing packing();

    public float price();

}
