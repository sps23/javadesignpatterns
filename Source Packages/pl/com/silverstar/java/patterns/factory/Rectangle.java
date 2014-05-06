package pl.com.silverstar.java.patterns.factory;

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
