/*
 * Abstract Factory patterns works around a super-factory which creates other factories. This factory is also called as
 * Factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the
 * best ways to create an object. In Abstract Factory pattern an interface is responsible for creating a factory of
 * related objects, without explicitly specifying their classes. Each generated factory can give the objects as per the
 * Factory pattern.
 */
package pl.com.silverstar.java.patterns.abstractfactory;

/**
 *
 * @author sylwester.stocki
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String type);

    public abstract Shape getShape(String type);
}
