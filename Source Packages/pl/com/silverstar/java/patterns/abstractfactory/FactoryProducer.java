package pl.com.silverstar.java.patterns.abstractfactory;

/**
 *
 * @author sylwester.stocki
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        if ("COLOR".equalsIgnoreCase(type)) {
            return new ColorFactory();
        } else if ("SHAPE".equalsIgnoreCase(type)) {
            return new ShapeFactory();
        } else {
            return null;
        }
    }

}
