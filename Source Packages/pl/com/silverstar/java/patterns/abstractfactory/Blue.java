package pl.com.silverstar.java.patterns.abstractfactory;

/**
 *
 * @author sylwester.stocki
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println(this.getClass().getName() + ":fill()");
    }

}
