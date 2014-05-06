package pl.com.silverstar.java.patterns.factory;

/**
 *
 * @author sylwester.stocki
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println(this.getClass().getName() + ":draw()");
    }

}
