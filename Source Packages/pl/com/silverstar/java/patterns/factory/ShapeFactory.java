package pl.com.silverstar.java.patterns.factory;

/**
 *
 * @author sylwester.stocki
 */
public class ShapeFactory {

    public Shape getShape(String type) {
        if (type == null) {
            return null;
        } else {
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
    }

}
