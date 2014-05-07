package pl.com.silverstar.java.patterns.abstractfactory;

/**
 *
 * @author sylwester.stocki
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String type) {
        if ("BLUE".equalsIgnoreCase(type)) {
            return new Blue();
        } else if ("GREEN".equalsIgnoreCase(type)) {
            return new Green();
        } else if ("RED".equalsIgnoreCase(type)) {
            return new Red();
        } else {
            return null;
        }
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}
