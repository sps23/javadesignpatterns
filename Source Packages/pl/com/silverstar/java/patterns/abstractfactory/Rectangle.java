package pl.com.silverstar.java.patterns.abstractfactory;

/**
 *
 * @author sylwester.stocki
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println(this.getClass().getName() + ":draw()");
    }

}
