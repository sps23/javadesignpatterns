package pl.com.silverstar.java.patterns.factory;

/**
 *
 * @author sylwester.stocki
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println(this.getClass().getName() + ":draw()");
    }

}
