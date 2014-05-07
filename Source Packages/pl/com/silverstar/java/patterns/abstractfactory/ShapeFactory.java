package pl.com.silverstar.java.patterns.abstractfactory;

/**
 *
 * @author sylwester.stocki
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(type)) {
            return new Square();
        } else {
            return null;
        }
    }

    @Override
    public Color getColor(String type) {
        return null;
    }

}
